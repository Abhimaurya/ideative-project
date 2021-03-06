package in.ideative.dao;

import in.ideative.model.User;

import org.springframework.stereotype.Component;

/**
 * Mapper for User Resource
 *
 * Created by harshit on 15/4/17.
 */
@Component
public interface UserDao {

  /**
   * Query to fetch user if exists in database with the given access token
   * @param accessToken a randomly generated accessToken
   * @return user if exists
   */
  User getUserByAccessToken(String accessToken);

  /**
   * Query to fetch a user
   * @param user with id/email
   * @return user
   */
  User getUser(User user);
}
