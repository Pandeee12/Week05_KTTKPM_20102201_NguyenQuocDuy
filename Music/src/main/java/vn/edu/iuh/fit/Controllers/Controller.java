package vn.edu.iuh.fit.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import vn.edu.iuh.fit.Repositories.SingerRepository;
import vn.edu.iuh.fit.Repositories.SongRepository;
import vn.edu.iuh.fit.Repositories.ViewRepository;
import vn.edu.iuh.fit.models.Singer;
import vn.edu.iuh.fit.models.Song;
import vn.edu.iuh.fit.models.View;

import java.util.List;

@RestController
@RequestMapping("/controller")
public class Controller {
    @Autowired
    private ViewRepository viewRepository;
    @Autowired
    private SongRepository songRepository;
    @Autowired
    private SingerRepository singerRepository;

    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/songs")
    public List<Song> getSongs(){
        for(long i=1; i<=10;i++){
            View view = restTemplate.getForObject("http://localhost:8080/controller/views/"+i,View.class);
            Song song = songRepository.findById(i).get();
            song.setView(view);
        }
        return songRepository.findAll();
    }

    @GetMapping("/singers")
    public List<Singer> getSingers(){
        for(long i=1; i<=10;i++){
            Song song = restTemplate.getForObject("http://localhost:8081/controller/songs/"+i,Song.class);
            Singer singer = singerRepository.findById(i).get();
            singer.setSong(song);
        }
        return singerRepository.findAll();
    }

    @GetMapping("/songs/{id}")
    Song getViewById(@PathVariable long id){
        View view = restTemplate.getForObject("http://localhost:8080/controller/views/"+id,View.class);
        Song song = songRepository.findById(id).get();
        song.setView(view);
        return song;
    }

    @GetMapping("/singers/{id}")
    Singer getSongById(@PathVariable long id){
        Song song = restTemplate.getForObject("http://localhost:8081/controller/songs/"+id,Song.class);
        Singer singer = singerRepository.findById(id).get();
        singer.setSong(song);
        return singer;
    }
}
