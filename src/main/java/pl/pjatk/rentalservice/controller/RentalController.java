package pl.pjatk.rentalservice.controller;

import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.rentalservice.model.Movie;
import pl.pjatk.rentalservice.service.RentalService;

@RestController
@RequestMapping("/rental")
public class RentalController {

    private final RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(
            @ApiParam(name = "id",
            type = "long",
            value = "1",
            example = "1",
            required = true,
            defaultValue = "1") @PathVariable Long id) {
        return ResponseEntity.ok(rentalService.findById(id));
    }

    @PutMapping("/{id}/true")
    public ResponseEntity<Movie> returnMovie(
            @PathVariable Long id) {
        return ResponseEntity.ok(rentalService.returnMovie(id));
    }

    @PutMapping("/{id}/false")
    public ResponseEntity<Movie> rentMovie(@PathVariable Long id) {
        return ResponseEntity.ok(rentalService.rentMovie(id));
    }
}
