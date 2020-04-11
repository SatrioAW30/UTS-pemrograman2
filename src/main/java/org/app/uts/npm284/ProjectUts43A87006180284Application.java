package org.app.uts.npm284;

import java.util.List;
import org.app.uts.npm284.barang.Barang;
import org.app.uts.npm284.repo.BarangRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectUts43A87006180284Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjectUts43A87006180284Application.class, args);
	}
        @Bean
        public CommandLineRunner testBarangRepository(BarangRepository repo) {
        return a-> {
               List<Barang> list = repo.findAll();
               System.out.format("%-15s %-40s %-30s %-20s \n","Id Barang","Nama Barang", 
                           "Jenis Barang","Harga");
                   System.out.println("------------------------------------------------------------"
                   +"----------------------------------------");
               list.forEach(c -> {
                   System.out.format("%-15s %-40s %-30s %-20s \n",
                           c.getIdBarang(),c.getNamaBarang(), 
                           c.getJenisBarang(),c.getHarga());
               });
           };
        }
}
