package care.cuddliness.stacy.repositories;

import care.cuddliness.stacy.entities.guild.BaseGuild;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GuildRepositoryInterface extends CrudRepository<BaseGuild, Long> {

    BaseGuild findById(long id);

    @Modifying
    @Query(value = "insert ignore into guilds (id) VALUES (:id)", nativeQuery = true)
    @Transactional
    void saveGuildIfExists(@Param("id") String id);


}
