package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataBaseConnectionDirectly {

	public static void main(String[] args) {
		// Database connection: JDBC connect
		String url = "jdbc:mysql://localhost:3306/javaselenium?serverTimezone=UTC&useSSL=false";
		String user = "root";
		String password = "root";

		// Create connection
		Connection connection = null;
		Statement statement = null;

		// Movie class is using to insert data
		// int movieId, String movieTitle, int releaseYear, String movieGenre, String
		// movieRating
		Movie mi2 = new Movie(10, "MI2", 2001, "action", "PG-12");
		Movie forrestGump = new Movie(11, "Forrest Gump", 1994, "romance", "PG-10");
		Movie harryPotter = new Movie(7, "Harry Potter", 2001, "Animation", "PG-13");
		Movie janitou = new Movie(6, "Janitou", 1985, "drama", "PG-11");
		Movie fastAndFurious = new Movie(2, "Fast And Furious", 2001, "Action", "PG-7");

		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(mi2);
		movies.add(forrestGump);
		movies.add(harryPotter);
		movies.add(janitou);
		movies.add(fastAndFurious);

		try {
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();
			// Insert into movieinfo(movieId,movieTitle,releaseYear) values(10,'v2',v3)
			for (Movie mv : movies) {
				String insertQuery = "insert into movieinfo( movieId, movieTitle,releaseYear,movieGenre, movieRating )"
						+ "values(" + mv.getMovieId() + ",'" + mv.getMovieTitle() + "'," + mv.getReleaseYear() + ",'"
						+ mv.getMovieGenre() + "','" + mv.getMovieRating() + "')";

				statement.execute(insertQuery);

				// Second SQL Query
				String getAllMovieInfo = "select * from movieinfo";
				statement.execute(getAllMovieInfo);
			}

		} catch (SQLException throwables) {
			throwables.printStackTrace();
		} finally {
			try {
				statement.close();
			} catch (SQLException throwables) {
				throwables.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException throwables) {
				throwables.printStackTrace();
			}
		}

	}
}
