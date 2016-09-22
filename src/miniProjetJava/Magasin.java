package miniProjetJava;

import java.util.Date;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;

public class Magasin {



	private ArrayList<Article> articles;
	private ArrayList<Client> clients;
	private ArrayList<Location> locations;



	public Magasin(ArrayList<Article> articles, ArrayList<Client> clients){

		this.articles = articles;
		this.clients = clients;
		locations = new ArrayList<Location>();


	}


	public void afficherArticleDispo(){

		for (Article article : articles) {

			System.out.println("Ref: " + article.reference);
			System.out.println("Marque: " + article.marque);
			System.out.println("Intitulé: " + article.intitule);
			System.out.println("Prix par jour de location: " + article.prixLocJour);
			System.out.println("\n");
			System.out.println("<------------------------------------------------------>");
			System.out.println("\n");
		}


	}


	public void enregistrerLoc(Location location){

		locations.add(location);


	}


	public void afficherLocEnCours(Client client){

		LocalDate dateToday = LocalDate.now();

		for (Location location : locations) {

			if (location.getClient() == client){

				if (location.getDateFin().isAfter( dateToday )){


					location.afficher();


				}

			}

		}


	}

	public void calculerTotal(Date dateDebut, Date dateFin){


		
		

	}


	public ArrayList<Article> getArticles() {
		return articles;
	}


	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}


	public ArrayList<Client> getClients() {
		return clients;
	}


	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}


	public ArrayList<Location> getLocations() {
		return locations;
	}


	public void setLocations(ArrayList<Location> locations) {
		this.locations = locations;
	}


}
