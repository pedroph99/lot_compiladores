class VariableNotFoundException(Exception):
    """Exceção personalizada para erros específicos da aplicação."""
    def __init__(self, mensagem: str, codigo: int = None):
        super().__init__(mensagem)
        self.codigo = codigo

class InvalidFrameworkException(Exception):
    """Exceção personalizada para erros específicos da aplicação."""
    def __init__(self, mensagem: str, codigo: int = None):
        super().__init__(mensagem)
        self.codigo = codigo

class InvalidObjectException(Exception):
    """Exceção personalizada para erros específicos da aplicação."""
    def __init__(self, mensagem: str, codigo: int = None):
        super().__init__(mensagem)
        self.codigo = codigo