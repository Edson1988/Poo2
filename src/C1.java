public class C1 {
    public static void main(String[] args) {
        Producto p1 = new Producto();

        p1.setNombre("Fabuloso");
        p1.setDescripcion("fabuloso morado");
        p1.setCodigo("FL123");
        p1.setPrecio(15.83);
        p1.setCapacidad(1F);
        p1.setMedida("Litros");
        p1.setMarca("cadilac");
        p1.setDisponible(true);



        Producto p2 = new Producto();

        p2.setNombre("Detergente");
        p2.setDescripcion("Detergente para ropa de color");
        p2.setCodigo("FL1235");
        p2.setPrecio(15.832);
        p2.setCapacidad(1F);
        p2.setMedida("Litros20");
        p2.setMarca("cadilacl");
        p2.setDisponible(true);


        //creamos un objeto de la clase de carrito de compras
        CarritoDeCompras carro= new CarritoDeCompras();

        carro.setAlto(12F);
        carro.setAncho(23F);
        carro.setProfundidad(34F);
        carro.setTipo("metal");
        carro.setMaterial("metaladd");


        //creamos un objeto de la clase cliente

        Cliente c = new Cliente();

        c.setNombre("javier");
        c.setApMaterno("Torres");
        c.setApMaterno("timal");
        c.setCorreo("javier@gmail.com");
        c.setEdad(22);
        c.setGenero('M');
        c.setNumCliente("lllll");
        c.setCarrito(carro);




        c.agregarProducto(p1);
        c.agregarProducto(p2);
        c. agregarProducto(p1);
        c.agregarProducto(p2);

        c.quitarProductos(p1);
        c.pagar();



    }
}
