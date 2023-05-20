package labseq.backend.controller;

import labseq.backend.service.LabseqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/labseq")
public class LabseqController {
    private final LabseqService labSeqService;

    @Autowired
    public LabseqController(LabseqService labSeqService) {
        this.labSeqService = labSeqService;
    }

    @GetMapping("/{n}")
    public int getValue(@PathVariable int n) {
        // Verify that n is a positive integer
        if (n < 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        }

        // Get the sequence
        return this.labSeqService.getValue(n);
    }
}
