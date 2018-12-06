public class Termino {
    private String palabra;
    private String categoria;
    private String id;
    public String getPalabra(){
        return palabra;
    }
    public String getCategoria(){
        return categoria;
    }

    public String getId(){
        return id;
    }
    
    public boolean esVerbo(){
       return categoria.startsWith("VM");
    }
    public boolean esSustantivo(){
       return categoria.startsWith("N");
    }

    public Termino(String palabra, String categoria, String id){
       this.palabra = palabra;
       this.categoria = categoria;
       this.id = id;
    }
    public String toString(){
       return " "+ palabra +" "+ categoria +" "+ id;
    }
}