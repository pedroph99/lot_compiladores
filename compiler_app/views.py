# compiler_app/views.py

from django.shortcuts import render
from django.http import JsonResponse
from django.views.decorators.csrf import csrf_exempt  
import subprocess  
import json
import os

def editor_index(request):
    return render(request, 'compiler_app/index.html')

@csrf_exempt 
def run_compiler(request):
    if request.method != 'POST':
        return JsonResponse({'success': False, 'errors': 'Método precisa ser POST'})

    try:
        data = json.loads(request.body)
        code_to_compile = data.get('code', '')

        temp_filename = 'temp_code.lot'
        with open(temp_filename, 'w', encoding='utf-8') as f:
            f.write(code_to_compile)

        command = [
            'python', 
            'main.py', 
            temp_filename
        ]

        result = subprocess.run(
            command, 
            capture_output=True, 
            text=True, 
            timeout=10,
            encoding='utf-8' 
        )

        os.remove(temp_filename)

        return JsonResponse({
            'success': True,
            'output': result.stdout,
            'errors': result.stderr
        })

    except Exception as e:
        if os.path.exists(temp_filename):
            os.remove(temp_filename)
        return JsonResponse({'success': False, 'errors': str(e)})