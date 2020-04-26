package persistence;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Class provides methods for reading subscribers from database and to database
 */
public class SubscriberDAO
{
    private Connection connection;

    public SubscriberDAO(Connection connection){ this.connection = connection; }

    public ArrayList<SubscriberDTO> getSubscribers(){

        String sqlStatement = "SELECT * FROM albertslundforsyning_db.abonnenter";
        try
        {   /* Preparing sql to fetch all subscribers */
            PreparedStatement statement = connection.prepareStatement(sqlStatement);
            /* Generating resultset from executeQuery() on statement */


            ResultSet resultSet = statement.executeQuery();

            ArrayList<SubscriberDTO> subscriberDTOS = new ArrayList<>();

            while(resultSet.next()){
                SubscriberDTO subscriber = new SubscriberDTO();

                subscriber.setId(resultSet.getInt("ID"));
                subscriber.setName(resultSet.getString("name"));
                subscriber.setAddress(resultSet.getString("address"));
                subscriber.setEmail(resultSet.getString("email"));
                subscriber.setPhonen(resultSet.getString("phonen"));
                subscriber.setComment(resultSet.getString("comment"));

                subscriberDTOS.add(subscriber);
            }

            return subscriberDTOS;

        } catch(SQLException e)
        {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

    /***
     * Method queries db for subscriber entry by supplied id.
     * Returns a subscriber object matching id, or a proxy if id was bad.
     */
    public SubscriberDTO getSubscriberById(int id)
    {


        return null;
    }

    /***
     *  Method writes supplied subscriber object to database.
     *  Returns an int at the value of the number of rows affected.
     *  If something went wrong, returns -1 */
    public int insertSubscriber(SubscriberDTO newSubscriber)
    {
        /* String sql statement for inserting new subsriber object in database */
        String sqlStatement = "INSERT INTO albertslundforsyning_db.abonnenter" +
                              "(ID, name, address, email, phonen, comment) VALUES (?,?,?,?,?,?)";

        try
        {
            PreparedStatement statement = connection.prepareStatement(sqlStatement);

            statement.setInt(1,newSubscriber.getId());
            statement.setString(2, newSubscriber.getName());
            statement.setString(3, newSubscriber.getAddress());
            statement.setString(4, newSubscriber.getEmail());
            statement.setString(5, newSubscriber.getPhonen());
            statement.setString(6, newSubscriber.getComment());

            return statement.executeUpdate();
        } catch(SQLException e)
        {
            e.printStackTrace();
        }

        return -1;
    }
}
