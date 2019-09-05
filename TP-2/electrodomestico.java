public class electrodomestico() {
  private String nombre;
  private double precioBase;
  private String color;
  private int consumo;
  private double peso;

  public electrodomestico(String nombre) {
    this.nombre = nombre;
    this.precioBase = 100.0;
    this.color = "gris plata";
    this.consumo = 10;
    this.peso = 2.0;
  }
  public electrodomestico(String nombre, double precio, String color, int consumo, double peso) {
    this.nombre = nombre;
    this.precioBase = precio;
    this.color = color;
    this.consumo = consumo;
    this.peso = peso;
  }
  public String getNombre() {
    return this.nombre;
  }
  public double getPrecioBase() {
    return this.precioBase;
  }
  public String getColor() {
    return this.color;
  }
  public int getConsumo() {
    return this.consumo;
  }
  public double getPeso() {
    return this.peso;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public void setPrecioBase(double precio) {
    this.precioBase = precio;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public void setConsumo(int consumo) {
    this.consumo = consumo;
  }
  public void setPeso(double peso) {
    this.peso = peso;
  }

  public boolean getBajoConsumo() {
    if (this.consumo < 45) {
       return getBajoConsumo = true;
    } else {
      return getBajoConsumo = false;
    }
  }
  public double getBalance() {
    return (this.precioBase/this.peso)
  }
  public boolean getAltaGama() {
    if (this.getBalance > 3.0) {
      return getAltaGama = true;
    } else {
      return getAltaGama = false;
    }
  }
}
