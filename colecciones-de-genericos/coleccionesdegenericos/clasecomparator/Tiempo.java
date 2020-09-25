package coleccionesdegenericos.clasecomparator;

public class Tiempo {

    private int hora; // 0 - 23
    private int minuto; // 0 - 59
    private int segundo; // 0 - 59

    public Tiempo(int hora, int minuto, int segundo) {
        if (hora < 0 || hora >= 24) {
            throw new IllegalArgumentException("hora debe estar entre 0 y 23.");
        }
        if (minuto < 0 || minuto >= 60) {
            throw new IllegalArgumentException("minuto debe estar entre 0 y 59.");
        }
        if (segundo < 0 || segundo >= 60) {
            throw new IllegalArgumentException("segundo debe estar entre 0 y 59.");
        }

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora >= 24) {
            throw new IllegalArgumentException("hora debe estar entre 0 y 23.");
        }
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto >= 60) {
            throw new IllegalArgumentException("minuto debe estar entre 0 y 59.");
        }
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        if (segundo < 0 || segundo >= 60) {
            throw new IllegalArgumentException("segundo debe estar entre 0 y 59.");
        }
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    // convierte el String en formato hora estándar (H:MM:SS AM o PM)
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHora() == 0 || getHora() == 12) ? 12 : getHora() % 12),
                getMinuto(), getSegundo(), (getHora() > 12 ? "AM" : "PM")); // hora
    }
}
