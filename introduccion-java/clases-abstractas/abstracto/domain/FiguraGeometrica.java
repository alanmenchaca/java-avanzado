package abstracto.domain;

public abstract class FiguraGeometrica {

    protected String tipoDeFigura;

    protected FiguraGeometrica(String tipoDeFigura) {
        this.tipoDeFigura = tipoDeFigura;
    }

    public abstract void dibujar();

    public String getTipoDeFigura() {
        return tipoDeFigura;
    }

    public void setTipoDeFigura(String tipoDeFigura) {
        this.tipoDeFigura = tipoDeFigura;
    }

    @Override
    public String toString() {
        return "Tipo de Figura: " + this.tipoDeFigura;
    }
}
