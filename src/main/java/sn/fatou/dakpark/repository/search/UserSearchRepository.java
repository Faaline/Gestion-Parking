package sn.fatou.dakpark.repository.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import sn.fatou.dakpark.domain.User;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {}
