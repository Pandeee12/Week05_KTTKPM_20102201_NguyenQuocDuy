package vn.edu.iuh.fit;

import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.Repositories.SingerRepository;
import vn.edu.iuh.fit.Repositories.SongRepository;
import vn.edu.iuh.fit.models.Singer;
import vn.edu.iuh.fit.models.Song;

import java.util.Locale;

@SpringBootApplication
public class MusicApplication {
    @Autowired
    private SongRepository songRepository;
    @Autowired
    private SingerRepository singerRepository;

    public static void main(String[] args) {
        SpringApplication.run(MusicApplication.class, args);
    }

    @Bean
    CommandLineRunner test(){
        return args -> {
            Faker faker = new Faker(new Locale("vi","VN"));
            for(int i=1; i<=10; i++){
                Song song = new Song(faker.name().name());
                songRepository.save(song);
                Singer singer = new Singer(faker.name().name(),faker.name().name());
                singerRepository.save(singer);
            }
        };
    }
}
