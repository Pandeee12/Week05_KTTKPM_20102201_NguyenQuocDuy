package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name="songs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="song_id")
    private long id;
    @Column(name="song_name")
    private String name;
    @OneToOne
    private View view;

    public Song(String name) {
        this.name = name;
    }
}
