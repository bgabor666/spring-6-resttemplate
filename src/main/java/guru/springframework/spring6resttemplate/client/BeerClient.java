package guru.springframework.spring6resttemplate.client;

import guru.springframework.spring6resttemplate.model.BeerDTO;
import guru.springframework.spring6resttemplate.model.BeerStyle;
import guru.springframework.spring6resttemplate.model.ListBeersParams;
import org.springframework.data.domain.Page;

public interface BeerClient {

    Page<BeerDTO> listBeers();

    Page<BeerDTO> listBeers(String beerName,
                            BeerStyle beerStyle,
                            Boolean showInventoryOnHand,
                            Integer pageNumber,
                            Integer pageSize);

    Page<BeerDTO> listBeers(ListBeersParams listBeersParams);
}
