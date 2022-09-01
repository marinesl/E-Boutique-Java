package boutique;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marine
 */
public class CollectionProduct {
    
    static ArrayList<Product> products = new ArrayList<Product>();
    
    private static void init() {
        Product p1 = new Product(1,"Boots - CONCERTO","Effet tendance garanti avec les boots CONCERTO. Le cuir lisse de ces chaussures femme à bout lisse s'allie avec le cuir velours sur l'arrière de la chaussure. On adore la boucle métallique qui ajoute à l'élégance du modèle. Conseil mode : On les a vu portées avec une large ceinture de cuir noir, pour un style moderne et élégant.",99.00,Brand.André);
        Product p2 = new Product(2,"Boots - FEELING G","Opter pour les boots FEELING G, c'est faire le choix de l'élégance ! On aime les ouvertures de chaque côté de la cheville de ces chaussures femme, ainsi que les strass brodés sur le talon et la fermeture à boucle. Ces boots en cuir lisse s'adapteront sans mal à toutes vos tenues.",99.00,Brand.André);
        Product p3 = new Product(3,"Sneakers - MARATHON 6","La sneaker MARATHON 6 brille par sa modernité. Une chaussure femme qui nous fait craquer avec une semelle épaisse tendance et des paillettes au style décalé. Conseil mode : La petite robe habillée ou la jupe patineuse feront de vous de véritables fashionistas !",55.00,Brand.André);
        Product p4 = new Product(4,"Sneakers - BRONX","On craque toutes pour BRONX !",45.00,Brand.André);
        Product p5 = new Product(5,"Escarpins - JOYAU","Osez les talons aiguilles avec les escarpins scintillants JOYAU ! Son profond décolleté associé au bout pointu en fait une chaussure femme glamour. On aime la hauteur du talon qui allonge la silhouette et la découpe originale à l'avant. Conseil mode : on l'associe à un slim en cuir et un haut vaporeux pour un look rock-chic.",69.00,Brand.André);
        Product p6 = new Product(6,"Escarpins - VENICIA","Jouez les femmes fatales avec ces escarpins VENICIA à talon aiguille et bout pointu. L'originalité de cette chaussure femme réside en son cuir imprimé façon reptile. Le décolleté est quant à lui souligné d¿un fin liseré qui met en valeur sa coupe. Conseil mode : au travail ou en soirée, ces escarpins seront parfaits !",99.00,Brand.André);
        Product p7 = new Product(7,"Sandales - FLAMBOYANTE","Avec son talon à imprimé ethnique et ses brides croisées à l'avant, la sandale compensée FLAMBOYANTE est un must-have ! Cette chaussure femme en cuir lisse allie originalité, élégance et confort grâce à sa plateforme à l'avant. Conseil mode : Adoptez-la pour un look bohème-chic !",95.00,Brand.André);
        Product p8 = new Product(8,"Sandales - GHISELE","Audacieuses, les sandales GHISELE à larges brides de cuir, talon compensé et plateforme vous propulsent au top de la tendance. La semelle de ces chaussures femme est en bois lisse et le talon est recouvert de corde pour un look estival. Conseil mode : Combinaison, jupe-short, imprimé ethnique, lancez-vous !",129.00,Brand.André);
        
        Product p9 = new Product(9,"Baila Spike Kid","Référence : 1160210BK65\n" + "Couleur : Noir\n" + "Matière : Cuir Kid\n" + "Hauteur Talon : 100mm\n" + "Collection : SS16",745.00,Brand.Louboutin);
        Product p10 = new Product(10,"Guni Pump Knot/Vernis","Référence : 1160863CM53\n" + "Couleur : Noir\n" + "Matière : Résille\n" + "Hauteur Talon : 100mm\n" + "Collection : SS16",695.00,Brand.Louboutin);
        Product p11 = new Product(11,"La Aichinger Veau Velours","Référence : 1160387CM47\n" + "Couleur : Noir\n" + "Matière : Veau velours\n" + "Hauteur Talon : 120mm\n" + "Collection : SS16",745.00,Brand.Louboutin);
        Product p12 = new Product(12,"Ron Ron Vernis","Référence : 3080120BK01\n" + "Couleur : NOIR\n" + "Matière : Vernis\n" + "Hauteur Talon : 100mm\n" + "Collection : Classique",515.00,Brand.Louboutin);
        Product p13 = new Product(13,"Tpoppins Vernis","Référence : 1160554PK1A\n" + "Couleur : Nude\n" + "Matière : Cuir de veau vernis\n" + "Hauteur Talon : 100mm\n" + "Collection : SS16",595.00,Brand.Louboutin);
        Product p14 = new Product(14,"Iriza Vernis","Référence : 3130524F094\n" + "Couleur : NEON\n" + "Matière : Cuir de veau vernis\n" + "Hauteur Talon : 100mm\n" + "Collection : Classique",515.00,Brand.Louboutin);
        Product p15 = new Product(15,"Pigalle Follies Vernis","Référence : 3140495O035\n" + "Couleur : Flamingo\n" + "Matière : Cuir de veau vernis\n" + "Hauteur Talon : 100mm\n" + "Collection : Classique",515.00,Brand.Louboutin);
        Product p16 = new Product(16,"Last Empress Veau Velours/Vernis","Référence : 1160425M379\n" + "Couleur : Noir et Ballerina\n" + "Matière : Cuir de veau vernis\n" + "Hauteur Talon : 100mm\n" + "Collection : SS16",845.00,Brand.Louboutin);
        
        Product p17 = new Product(17,"Women’s Leigh II Ankle Strap Graphic Wedge","La deuxième génération de la collection Leigh reprend les codes de l’original, une touche d’élégance et de confort en plus. Ce modèle aux lignes féminines associe de façon très réussie des brides en cuir synthétique et toile. Nous avons habillé les brides situées sur l’avant-pied d’un ravissant imprimé floral printanier. Posée sur un talon compensé, l’assise plantaire en résine Croslite™ est renforcée au niveau de la voûte plantaire pour assurer le confort de vos pieds tout au long de la journée.",69.99,Brand.Crocs);
        Product p18 = new Product(18,"Women’s Cyprus V Heel","Toujours plus belles. Cette version à brides des Cyprus couvre un peu plus le dessus du pied et s’agrémente de pièces en métal sur le haut de la tige. Vous apprécierez les élastiques discrets intégrés aux brides qui assurent un maintien plus confortable. Vous retrouverez bien évidemment la souplesse et le confort d’une assise plantaire en résine Croslite™.",49.99,Brand.Crocs);
        Product p19 = new Product(19,"Specialist","Des couleurs agréables, une touche de personnalisation, et une tonne de confort – une surprenante combinaison pour les sabots professionnels Crocs™. Voici les Crocs™ Specialist, des sabots pour le personnel en salle, conçues pour un confort parfait du talon aux orteils.",39.99,Brand.Crocs);
        Product p20 = new Product(20,"Neria Work","Faites rimer confort et travail. Les Neria Work sont des chaussures de travail légères pour femmes dotées d’un talon fermé qui ne serre pas pour permettre à votre talon de se mouvoir librement de haut en bas lorsque vous marchez.",49.99,Brand.Crocs);
        Product p21 = new Product(21,"Women’s Crocs Rio Leopard Fade Flat","Elegant, beautifully styled and a lot of fun — these flats have translucent uppers and a sophisticated leopard pattern that has just enough roar without being too loud. The slightly pointed toe shape is on trend, and you get all the comfort you’re looking for with a Croslite™ foam footbed.",54.99,Brand.Crocs);
        Product p22 = new Product(22,"Women’s CitiLane Flat","Looks more like a sneaker than a flat — with vintage-inspired cupsole design, stitching details, and the overall shape and attitude. And it has the comfort to match, with twin gore panels for easy on and off, as well as a Croslite™ foam footbed and outsole for a double shot of Crocs cushion. Light and laid-back, CitiLane flats get you around town in casual style.",34.99,Brand.Crocs);
        Product p23 = new Product(23,"Women’s Crocs Gianna Red Lips Flat","Have more fun in your flats — that’s the thinking behind these special-edition Giannas created in collaboration with legendary fashion designer Patricia Field. She’s won 2 Emmys and an Academy Award nomination for her fashion designs featured in Sex and The City, The Devil Wears Prada, and The Other Woman. And her House of Field boutique in New York City is a fashion destination. She’s brought her vibrant red lips design to our popular Gianna flats — light, comfortable and now with a kiss of style.",59.99,Brand.Crocs);
        Product p24 = new Product(24,"Women’s Crocs Rio Flat","Peut-être les chaussures plates les plus élégantes que nous ayons jamais créées — parfaitement polyvalentes avec leur avant-pied effilé et leur tige translucide souple. Pour un look chic ou décontracté. Quel que soit votre choix, ce modèle très coloré vous offrira tout le confort Crocs que vous affectionnez tant.",49.99,Brand.Crocs);
        
        
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
        products.add(p7);
        products.add(p8);
        products.add(p9);
        products.add(p10);
        products.add(p11);
        products.add(p12);
        products.add(p13);
        products.add(p14);
        products.add(p15);
        products.add(p16);
        products.add(p17);
        products.add(p18);
        products.add(p19);
        products.add(p20);
        products.add(p21);
        products.add(p22);
        products.add(p23);
        products.add(p24);
    }
    
    public static ArrayList<Product> example() {
        if(products.isEmpty()) {
            init();
        }
        return products;
    }
    
    public static Product getProductById(int id){
        for(Product element: products) {
            if(element.getId() == id) {
                return element;
            }
        }
        return null;
    }
    
}
