package udla.allanos.basededatos;

public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/java_jdbc";
    String us = "root";    String pw = "sasa";
    try {        Connection conn = DriverManager.getConnection(url,us,pw);
        Statement st = conn.createStatement();
        ResultSet resultado = st.executeQuery("Select * From productos;");
        while (resultado.next()){
            System.out.print(resultado.getInt("id"));
            System.out.print("  ");
            System.out.print(resultado.getString("nombreequipo"));
            System.out.print(" | ");
            System.out.print(resultado.getString("marca"));
            System.out.print(" | ");
            System.out.print(resultado.getString("color"));
            System.out.print(" | ");
            System.out.print(resultado.getString("precio"));
            System.out.println("$");
        }
    } catch (SQLException e)
    {
        throw new RuntimeException(e);
    }
}