package mapper;

import domain.User;
import domain.UserRole;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper {
    public static User map(ResultSet result) throws SQLException {
        int id = result.getInt("id");
        String role = result.getString("role");
        String firstName = result.getString("firstName");
        String  lastName = result.getString("lastName");
        String email = result.getString("email");
        String password = result.getString("password");

        return new User(email, firstName, lastName, password,UserRole.valueOf(role.toUpperCase()).toString());
    }
}
