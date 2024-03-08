package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name="Singers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Singer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="singer_id")
    private long id;
    @Column(name="singer_name")
    private String name;
    private String password;
    @OneToOne
    private Song song;
    public Singer( String name, String password) {
        this.name = name;
        this.password = password;
    }
}
