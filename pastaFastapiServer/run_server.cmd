@echo off
setlocal
python -m uvicorn pastaFastapiServer.app:app --host 127.0.0.1 --port 8000

