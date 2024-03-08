//package vn.edu.iuh.fit.Services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import vn.edu.iuh.fit.Repositories.SingerRepository;
//import vn.edu.iuh.fit.Repositories.SongRepository;
//import vn.edu.iuh.fit.jwt.CustomSinger;
//import vn.edu.iuh.fit.models.Singer;
//import vn.edu.iuh.fit.models.Song;
//
//@Service
//public class SingerService   {
//    @Autowired
//    private SingerRepository singerRepository;
//
//    public UserDetails loadSingerBySongName(String name){
//         Singer singer = singerRepository.findBySingername(name);
//        if (singer == null) {
//            throw new UsernameNotFoundException(name);
//        }
//        return new CustomSinger(singer);
//
//    }
//}
