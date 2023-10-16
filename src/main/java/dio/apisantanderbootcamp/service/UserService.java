package dio.apisantanderbootcamp.service;

import dio.apisantanderbootcamp.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
