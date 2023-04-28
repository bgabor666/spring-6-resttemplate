package guru.springframework.spring6resttemplate.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ListBeersParams {
    private String beerName;
    private BeerStyle beerStyle;
    private Boolean showInventoryOnHand;
    private Integer pageNumber;
    private Integer pageSize;
}
