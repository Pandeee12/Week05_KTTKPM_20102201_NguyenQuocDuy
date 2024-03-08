package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@Table(name="views")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class View {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="view_id")
    private long id;
    private int view;

    public View(int view) {
        this.view = view;
    }
}
