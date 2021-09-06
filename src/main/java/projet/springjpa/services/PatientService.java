package projet.springjpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projet.springjpa.repositories.PatientRepository;
import projet.springjpa.repositories.VilleRepository;

@Service
public class PatientService {

    private final PatientRepository pr;
    private final VilleRepository vr;

    public PatientService(PatientRepository pr, VilleRepository vr, PatientService ps) {
        this.pr = pr;
        this.vr = vr;
        this.ps = ps;
    }

    @Autowired
    private final PatientService ps;

    /*public PatientController(PatientRepository pr, VilleRepository vr,PatientRepository pr1, VilleRepository vr1, PatientService ps){
        this.pr=pr1;
        this.vr=vr1;
        this.ps=ps;
    }

     */
}
