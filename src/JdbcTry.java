import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcTry
{

	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/schematwo","root","Sananda@1997");
		Statement stmt=connection.createStatement();
		System.out.println("enter the customer id");
		int Id=sc.nextInt();
		ResultSet users=stmt.executeQuery(" select * from customer_details where id='+Id+'");
		while(users.next())
		{
			System.out.println(users.getInt(1)+","+users.getString(2));
		}
	}
}



	


