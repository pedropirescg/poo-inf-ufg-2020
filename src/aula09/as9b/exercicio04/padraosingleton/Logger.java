package aula09.as9b.exercicio04.padraosingleton;

public class Logger {
    /* por default não imprime o log */
    private boolean ativo = false;
    static Logger logger = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean b) {
        this.ativo = b;
    }

    public void log(String s) {
        if(this.ativo)
            System.out.println("LOG :: " + s);
    }
}
