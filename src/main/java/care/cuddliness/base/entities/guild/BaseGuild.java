package care.cuddliness.base.entities.guild;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "guilds")
public class BaseGuild {


    @Getter
    @Setter
    @Id
    private Long id;
    public String naughtyWords;

    public BaseGuild() {

    }


}
