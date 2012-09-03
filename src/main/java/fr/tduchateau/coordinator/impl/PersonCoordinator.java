package fr.tduchateau.coordinator.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.tduchateau.coordinator.IPersonCoordinator;
import fr.tduchateau.entity.Address;
import fr.tduchateau.entity.Person;
import fr.tduchateau.entity.Town;

/**
 * Implementation of the Person coordinator.
 * 
 * @author tduchateau
 */
@Service
public class PersonCoordinator implements IPersonCoordinator {

	/**
	 * {@inheritDoc}
	 */
	public List<Person> findAll(){
		
		List<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person(1L,"Cherokee","Randall","Ut.sagittis@elitelit.ca", new Address("6858 A Avenue", new Town("Carson City"))));
		persons.add(new Person(2L,"Gray","Stevens","sagittis@Donecat.ca", new Address("651-8336 Mattis St.", new Town("San Fernando"))));
		persons.add(new Person(3L,"Cairo","Kline","quis@Aliquameratvolutpat.org", new Address("P.O. Box 447, 3428 Orci Rd.", new Town("Temple City"))));
		persons.add(new Person(4L,"Reed","Dotson","purus.in.molestie@ametrisus.com", new Address("2769 Curabitur Avenue", new Town("Pittsfield"))));
		persons.add(new Person(5L,"Evangeline","Hampton","Aliquam@lectus.edu", new Address("727-976 In St.", new Town("Brookings"))));
		persons.add(new Person(6L,"Illana","Mendez","purus@ametrisusDonec.org", new Address("P.O. Box 631, 9317 Lobortis Av.", new Town("Jeffersontown"))));
		persons.add(new Person(7L,"Buckminster","Stark","lectus@maurisblandit.ca", new Address("6379 Semper Rd.", new Town("McAllen"))));
		persons.add(new Person(8L,"Nyssa","Singleton","vehicula@leoelementumsem.ca", new Address("Ap #557-4673 Eget Road", new Town("Easton"))));
		persons.add(new Person(9L,"Noble","Flores","Morbi.sit@semper.com", new Address("6706 Vivamus St.", new Town("Miami Gardens"))));
		persons.add(new Person(10L,"Malcolm","Hale","Donec@pretium.com", new Address("7990 Egestas Rd.", new Town("Rome"))));
		persons.add(new Person(11L,"Logan","Good","risus@ligulaeuenim.org", new Address("8718 Enim Av.", new Town("Brockton"))));
		persons.add(new Person(12L,"Louis","Franklin","bibendum@volutpat.edu", new Address("P.O. Box 475, 2667 Etiam Street", new Town("San Bernardino"))));
		persons.add(new Person(13L,"Quincy","Burke","Sed.eu@semmolestiesodales.edu", new Address("214-8848 Mauris Street", new Town("Turlock"))));
		persons.add(new Person(14L,"Neil","Richmond","tempor.arcu.Vestibulum@quamafelis.ca", new Address("P.O. Box 964, 1551 Nisi. Avenue", new Town("Schenectady"))));
		persons.add(new Person(15L,"Coby","Gould","aliquam@dolor.org", new Address("Ap #735-6736 Iaculis Rd.", new Town("Rye"))));
		persons.add(new Person(16L,"acqueline","Benton","ultricies.adipiscing.enim@Uttinciduntorci.org", new Address("Ap #172-485 In St.", new Town("New London"))));
		persons.add(new Person(17L,"Angela","Best","Mauris.vel@liberoettristique.org", new Address("Ap #209-8475 Dolor Street", new Town("Dover"))));
		persons.add(new Person(18L,"May","Gonzales","Cum.sociis.natoque@non.com", new Address("651-4827 Sollicitudin Av.", new Town("Bessemer"))));
		persons.add(new Person(19L,"Rafael","Alford","at@Sedneque.ca", new Address("9957 Molestie Road", new Town("Wichita"))));
		persons.add(new Person(20L,"Tana","Dudley","arcu.imperdiet.ullamcorper@erat.org", new Address("5735 Nulla. Av.", new Town("San Jose"))));
		persons.add(new Person(21L,"Harper","Mccray","vitae.velit@non.ca", new Address("7928 Imperdiet St.", new Town("Raleigh"))));
		persons.add(new Person(22L,"Clare","Norman","aliquet.metus.urna@fringillaporttitor.org", new Address("413-2959 Tristique St.", new Town("Chickasha"))));
		persons.add(new Person(23L,"Aiko","Pratt","Ut@Quisque.com", new Address("P.O. Box 185, 5216 At, Road", new Town("West Warwick"))));
		persons.add(new Person(24L,"Ashton","Merritt","Nam.nulla.magna@erosturpis.org", new Address("2363 Arcu Ave", new Town("Hackensack"))));
		persons.add(new Person(25L,"Felicia","Hester","lorem.fringilla@amagnaLorem.org", new Address("Ap #776-6004 Orci, Av.", new Town("Beverly"))));
		persons.add(new Person(26L,"Martena","Anthony","Suspendisse@utsem.ca", new Address("Ap #559-2964 Turpis St.", new Town("Cumberland"))));
		persons.add(new Person(27L,"Rigel","Bennett","tincidunt@nibhenim.com", new Address("P.O. Box 840, 8576 A, St.", new Town("Nampa"))));
		persons.add(new Person(28L,"Lysandra","Lucas","mauris.eu@duinec.edu", new Address("501 Cursus Ave", new Town("Meridian"))));
		persons.add(new Person(29L,"Unity","Clay","sed@utodio.edu", new Address("955-1515 Enim. Rd.", new Town("Port Washington"))));
		persons.add(new Person(30L,"Zenaida","Fuller","In.at.pede@in.com", new Address("Ap #418-8291 In Av.", new Town("Sunbury"))));
		persons.add(new Person(31L,"Clinton","Massey","lorem.luctus@augue.com", new Address("7922 Aliquam Avenue", new Town("Dearborn"))));
		persons.add(new Person(32L,"Idona","Hines","eleifend.vitae@intempus.com", new Address("P.O. Box 152, 5620 Tempor St.", new Town("Natchez"))));
		persons.add(new Person(33L,"Rama","Hardin","diam@vitae.com", new Address("Ap #913-3234 Lorem Ave", new Town("Ames"))));
		persons.add(new Person(34L,"Declan","Francis","sed.sapien.Nunc@parturientmontes.com", new Address("P.O. Box 305, 703 Malesuada Ave", new Town("Valdez"))));
		persons.add(new Person(35L,"Ezekiel","Diaz","Proin.ultrices.Duis@egetipsumSuspendisse.com", new Address("293-2409 Nonummy Avenue", new Town("Durant"))));
		persons.add(new Person(36L,"Yael","Schultz","ornare@urnajustofaucibus.org", new Address("P.O. Box 176, 9174 Ipsum. Rd.", new Town("Cedar Falls"))));
		persons.add(new Person(37L,"Rashad","Watson","Pellentesque.habitant@ridiculusmusDonec.edu", new Address("6032 Neque Rd.", new Town("Santa Clarita"))));
		persons.add(new Person(38L,"Aladdin","Keith","Fusce@disparturientmontes.edu", new Address("Ap #454-877 Sed Ave", new Town("Bossier City"))));
		persons.add(new Person(39L,"Callie","Lee","ornare@auctorquis.edu", new Address("2689 Nulla Ave", new Town("Jacksonville"))));
		persons.add(new Person(40L,"Wang","Brock","Nulla.facilisis.Suspendisse@venenatisamagna.ca", new Address("P.O. Box 924, 5785 Ipsum. St.", new Town("Gloversville"))));
		persons.add(new Person(41L,"Jaquelyn","Dorsey","scelerisque.neque.sed@vulputate.edu", new Address("P.O. Box 368, 5299 Fringilla St.", new Town("Edmond"))));
		persons.add(new Person(42L,"Nathan","Elliott","eu@anequeNullam.edu", new Address("4486 Donec Avenue", new Town("Sonoma"))));
		persons.add(new Person(43L,"William","Kerr","amet.metus.Aliquam@condimentum.com", new Address("P.O. Box 679, 1021 Ipsum. St.", new Town("Cortland"))));
		persons.add(new Person(44L,"Josiah","Doyle","vitae.risus@nisinibhlacinia.com", new Address("756-9024 A, Av.", new Town("Livonia"))));
		persons.add(new Person(45L,"Heather","Singleton","Donec@suscipitnonummyFusce.com", new Address("985-4365 Lorem, St.", new Town("Portsmouth"))));
		persons.add(new Person(46L,"Burton","Middleton","cubilia.Curae;@egestasblanditNam.com", new Address("975-1543 Vel Rd.", new Town("Fort Dodge"))));
		persons.add(new Person(47L,"Rhoda","Mcdaniel","nisi@bibendum.org", new Address("P.O. Box 621, 5938 Lobortis Street", new Town("Utica"))));
		persons.add(new Person(48L,"Michelle","Wright","erat.Sed.nunc@semperrutrumFusce.org", new Address("Ap #941-7570 Ut Street", new Town("Shamokin"))));
		persons.add(new Person(49L,"Lesley","Andrews","vel.pede.blandit@est.com", new Address("798-8537 Lorem Street", new Town("Saint Louis"))));
		persons.add(new Person(50L,"Allegra","Bray","eu.tellus@dolor.org", new Address("952-8632 Massa. St.", new Town("Houma"))));
		persons.add(new Person(51L,"Colt","Hewitt","Duis.risus@dictum.ca", new Address("678-9909 Sapien. Rd.", new Town("Oneida"))));
		persons.add(new Person(52L,"Vladimir","Henry","erat.vitae@aliquam.ca", new Address("5727 Ante, St.", new Town("Pocatello"))));
		persons.add(new Person(53L,"Rose","Palmer","tellus@consequatenim.ca", new Address("2336 Vestibulum Ave", new Town("Pico Rivera"))));
		persons.add(new Person(54L,"Violet","English","at.velit@acrisusMorbi.ca", new Address("685-9486 Purus. Ave", new Town("Saratoga Springs"))));
		persons.add(new Person(55L,"Kevin","Kaufman","amet.faucibus.ut@Duis.com", new Address("P.O. Box 387, 960 Nullam Rd.", new Town("Agoura Hills"))));
		persons.add(new Person(56L,"Emmanuel","Solis","Quisque.fringilla.euismod@Morbiaccumsan.ca", new Address("Ap #346-598 Dolor St.", new Town("Middletown"))));
		persons.add(new Person(57L,"Allistair","Harrington","feugiat@sagittis.com", new Address("Ap #750-4749 A, St.", new Town("Fall River"))));
		persons.add(new Person(58L,"Halee","Kent","quis.accumsan@consectetueripsum.com", new Address("3611 Duis Road", new Town("Derby"))));
		persons.add(new Person(59L,"Remedios","Kidd","ac.turpis.egestas@seddolor.edu", new Address("P.O. Box 229, 4774 Commodo Ave", new Town("Middletown"))));
		persons.add(new Person(60L,"Deborah","Obrien","nec@dignissim.com", new Address("1530 Sociis Avenue", new Town("Titusville"))));
		persons.add(new Person(61L,"Britanni","Mckinney","adipiscing@dictumauguemalesuada.ca", new Address("144 Odio Rd.", new Town("Ypsilanti"))));
		persons.add(new Person(62L,"Yasir","Warren","netus.et.malesuada@nec.org", new Address("Ap #385-202 Velit Av.", new Town("Bozeman"))));
		persons.add(new Person(63L,"Melyssa","Mullen","in@vestibulumneceuismod.org", new Address("Ap #422-8683 Nulla Street", new Town("Idaho Falls"))));
		persons.add(new Person(64L,"Rooney","Greer","sem@augueSed.ca", new Address("2636 A Street", new Town("West Bend"))));
		persons.add(new Person(65L,"Chiquita","Burke","gravida.sit.amet@tortor.edu", new Address("Ap #622-8487 Dolor Av.", new Town("Eau Claire"))));
		persons.add(new Person(66L,"Yoshio","Castaneda","libero.nec.ligula@In.edu", new Address("7489 Nam Rd.", new Town("Santa Cruz"))));
		persons.add(new Person(67L,"Orli","Sargent","et@semper.ca", new Address("390-5324 Ipsum. Ave", new Town("Laguna Woods"))));
		persons.add(new Person(68L,"Bianca","Harris","tortor@Nullam.org", new Address("P.O. Box 478, 5262 Velit. Street", new Town("Chicago"))));
		persons.add(new Person(69L,"Risa","Blackburn","blandit@cursuseteros.com", new Address("175-2433 Integer Rd.", new Town("North Chicago"))));
		persons.add(new Person(70L,"Scarlet","Leonard","iaculis.aliquet.diam@et.ca", new Address("5168 Lorem Ave", new Town("Jackson"))));
		persons.add(new Person(71L,"Hector","Reyes","nunc.In@interdum.org", new Address("P.O. Box 310, 5906 Vivamus Ave", new Town("Melrose"))));
		persons.add(new Person(72L,"Daphne","Barnett","sed.pede.Cum@mauris.edu", new Address("Ap #827-6652 Ultricies Rd.", new Town("Evanston"))));
		persons.add(new Person(73L,"Victoria","Herring","ut@orcilacusvestibulum.edu", new Address("868-1112 Nostra, Rd.", new Town("South Burlington"))));
		persons.add(new Person(74L,"Lareina","Ewing","gravida@Donecsollicitudinadipiscing.edu", new Address("503-8061 Vulputate Rd.", new Town("Fairfax"))));
		persons.add(new Person(75L,"Amela","Garner","est@Quisquetincidunt.edu", new Address("5530 Risus Rd.", new Town("Paterson"))));
		persons.add(new Person(76L,"Cora","Baird","nisi@massa.org", new Address("2398 Sem St.", new Town("Janesville"))));
		persons.add(new Person(77L,"Adrian","Bates","sagittis@eratvolutpat.ca", new Address("2537 Iaculis St.", new Town("Santa Cruz"))));
		persons.add(new Person(78L,"Tanek","Grimes","ac.eleifend.vitae@Fusce.edu", new Address("P.O. Box 659, 4036 Praesent Street", new Town("Edmond"))));
		persons.add(new Person(79L,"Donovan","Ryan","Aliquam.ultrices@et.edu", new Address("Ap #625-7335 Aenean Av.", new Town("Greensburg"))));
		persons.add(new Person(80L,"Brianna","Wade","Vivamus@nonegestasa.org", new Address("P.O. Box 693, 5388 Est. Rd.", new Town("Natchitoches"))));
		persons.add(new Person(81L,"Ursa","Riddle","gravida@Suspendisse.edu", new Address("P.O. Box 263, 6806 Mauris Rd.", new Town("Easton"))));
		persons.add(new Person(82L,"Alvin","Dyer","tristique.aliquet.Phasellus@aarcu.org", new Address("947-828 In Road", new Town("Starkville"))));
		persons.add(new Person(83L,"Idona","Camacho","nunc.ullamcorper@nonluctussit.org", new Address("4765 Duis Ave", new Town("Torrance"))));
		persons.add(new Person(84L,"Cain","Bean","sociis@ligulaAeneangravida.com", new Address("P.O. Box 647, 1340 Eget St.", new Town("Signal Hill"))));
		persons.add(new Person(85L,"Isaac","Hunter","feugiat@Aeneanmassa.ca", new Address("4182 Amet Rd.", new Town("Bradford"))));
		persons.add(new Person(86L,"Jescie","Hansen","posuere.cubilia.Curae;@ligulaDonecluctus.com", new Address("Ap #676-1690 Enim. Av.", new Town("Beaver Falls"))));
		persons.add(new Person(87L,"Malcolm","Gallagher","rhoncus@dolorquam.org", new Address("P.O. Box 497, 4547 Nunc Street", new Town("Suffolk"))));
		persons.add(new Person(88L,"Boris","Browning","Proin.vel@non.ca", new Address("8598 Non Road", new Town("Port St. Lucie"))));
		persons.add(new Person(89L,"Michael","Pacheco","nec.diam@Inornaresagittis.ca", new Address("P.O. Box 663, 7335 Nunc Ave", new Town("Sturgis"))));
		persons.add(new Person(90L,"Kelly","Barry","nec.imperdiet.nec@eratnonummy.edu", new Address("Ap #830-5433 Facilisis, Road", new Town("Macomb"))));
		persons.add(new Person(91L,"Tate","Stokes","Suspendisse@eueuismod.com", new Address("551-2196 At Street", new Town("Layton"))));
		persons.add(new Person(92L,"Chester","Hatfield","mattis@magna.ca", new Address("106-7201 Lobortis Rd.", new Town("Battle Creek"))));
		persons.add(new Person(93L,"Irene","Garza","imperdiet.nec.leo@fermentumconvallisligula.ca", new Address("180-9816 Sapien. Rd.", new Town("La Mirada"))));
		persons.add(new Person(94L,"Giselle","Fletcher","Vestibulum.ut.eros@vitaepurusgravida.ca", new Address("P.O. Box 600, 599 Nisi St.", new Town("Jonesboro"))));
		persons.add(new Person(95L,"Charissa","Koch","amet.luctus@Integervulputate.edu", new Address("P.O. Box 296, 7155 Amet, Av.", new Town("Danbury"))));
		persons.add(new Person(96L,"Paul","Chandler","faucibus@loremfringilla.edu", new Address("7508 Eu Street", new Town("Corpus Christi"))));
		persons.add(new Person(97L,"Noah","Serrano","per.conubia@eterosProin.com", new Address("969-1963 Mauris Street", new Town("Moorhead"))));
		persons.add(new Person(98L,"Hu","Bartlett","Donec.consectetuer.mauris@enimmitempor.com", new Address("P.O. Box 591, 8579 Dapibus St.", new Town("Calumet City"))));
		persons.add(new Person(99L,"Brynne","Boyd","enim.mi.tempor@sociis.org", new Address("Ap #629-3651 Condimentum. Avenue", new Town("Wynne"))));
		persons.add(new Person(100L,"Tashya","Patton","Nam.interdum.enim@eleifend.edu", new Address("8463 Pharetra St.", new Town("Henderson"))));
		
		return persons;
	}
}
