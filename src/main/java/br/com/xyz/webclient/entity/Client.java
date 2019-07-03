package br.com.xyz.webclient.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "cliente")
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imageDocker;

    @Column(unique = true)
    private String nameConteiner;
    private Integer portConteiner;
    private String usernameDatabase;
    private String passwordDatabase;

    @Column(unique = true)
    private String nameDatabase;
    private Boolean active;

    public Client() {
    }

    public Client(Long id, String imageDocker, String nameConteiner, Integer portConteiner, String usernameDatabase, String passwordDatabase, String nameDatabase, Boolean active) {
        this.id = id;
        this.imageDocker = imageDocker;
        this.nameConteiner = nameConteiner;
        this.portConteiner = portConteiner;
        this.usernameDatabase = usernameDatabase;
        this.passwordDatabase = passwordDatabase;
        this.nameDatabase = nameDatabase;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageDocker() {
        return imageDocker;
    }

    public void setImageDocker(String imageDocker) {
        this.imageDocker = imageDocker;
    }

    public String getNameConteiner() {
        return nameConteiner;
    }

    public void setNameConteiner(String nameConteiner) {
        this.nameConteiner = nameConteiner;
    }

    public Integer getPortConteiner() {
        return portConteiner;
    }

    public void setPortConteiner(Integer portConteiner) {
        this.portConteiner = portConteiner;
    }

    public String getUsernameDatabase() {
        return usernameDatabase;
    }

    public void setUsernameDatabase(String usernameDatabase) {
        this.usernameDatabase = usernameDatabase;
    }

    public String getPasswordDatabase() {
        return passwordDatabase;
    }

    public void setPasswordDatabase(String passwordDatabase) {
        this.passwordDatabase = passwordDatabase;
    }

    public String getNameDatabase() {
        return nameDatabase;
    }

    public void setNameDatabase(String nameDatabase) {
        this.nameDatabase = nameDatabase;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client that = (Client) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", imageDocker='" + imageDocker + '\'' +
                ", nameConteiner='" + nameConteiner + '\'' +
                ", portConteiner=" + portConteiner +
                ", usernameDatabase='" + usernameDatabase + '\'' +
                ", passwordDatabase='" + passwordDatabase + '\'' +
                ", nameDatabase='" + nameDatabase + '\'' +
                ", active=" + active +
                '}';
    }
}
