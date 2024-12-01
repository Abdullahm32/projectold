package home.home.Service;

import home.home.Controller.Home;
import home.home.Entity.NewEntity;
import home.home.Repository.NewEntityRepository;
import home.home.dto.Homedto;
import org.springframework.stereotype.Service;

@Service
public class HomeSErviceImpl implements HomeService{

    private NewEntityRepository repo;

    public HomeSErviceImpl(NewEntityRepository repo) {
        this.repo = repo;
    }


    @Override
    public Homedto adddatas(Homedto dto) {

        NewEntity entity = new NewEntity();
        entity.setName(dto.getName());
         NewEntity save = repo.save(entity);

        Homedto dtoq = new Homedto();
        dtoq.setId(save.getId());
        dtoq.setName(save.getName());
        return dtoq;

    }
}
