package home.home.Controller;

import home.home.Service.HomeService;
import home.home.dto.Homedto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/addhome")
public class Home {

    private HomeService session;


    public Home(HomeService session) {
        this.session = session;
    }
    // http://localhost:8080/api/v1/addhome
    @PostMapping
    public ResponseEntity<Homedto>addData(@RequestBody Homedto dto){
        Homedto dtop = session.adddatas(dto);
        return new ResponseEntity<>(dtop, HttpStatus.CREATED);
    }
}
