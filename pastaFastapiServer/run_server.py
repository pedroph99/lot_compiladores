from pastaFastapiServer.app import app

if __name__ == "__main__":
    try:
        import uvicorn  # type: ignore
    except Exception as exc:
        raise SystemExit(
            "Uvicorn não está instalado. Instale com: pip install uvicorn fastapi"
        ) from exc

    uvicorn.run(app, host="127.0.0.1", port=8000)

