
package semana11;


public class Platillos {
    private String platillo,tipoPlatillo;
    private int cantidad,precio;

    public Platillos(String platillo, String tipoPlatillo, int cantidad, int precio) {
        this.platillo = platillo;
        this.tipoPlatillo = tipoPlatillo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Platillos{" + "platillo=" + platillo + ", tipoPlatillo=" + tipoPlatillo + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }

    public String getPlatillo() {
        return platillo;
    }

    public void setPlatillo(String platillo) {
        this.platillo = platillo;
    }

    public String getTipoPlatillo() {
        return tipoPlatillo;
    }

    public void setTipoPlatillo(String tipoPlatillo) {
        this.tipoPlatillo = tipoPlatillo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
