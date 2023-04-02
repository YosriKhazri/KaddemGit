package tn.esprit.kaddem.DAO.Entites;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Contrat")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contrat implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontrat")
    long idContrat;
    @Column(name = "dateDebutC")
    @Temporal(TemporalType.DATE)
    Date dateDebutC;
    @Column(name = "dateFinC")
    Date dateFinC;
    @Column(name = "specialite")
    @Enumerated(EnumType.STRING)
    Specialite specialite;
    @Column(name = "archive")
    boolean archive;
    @Column(name = "montantC")
    float montantC;
}