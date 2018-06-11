
package biblioteca;

import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int opc=0;
        Autor.c=0;
        int c2=0;
        boolean canterior;
        Autor [] lista_aut = new Autor[10];
        int nlibros []= new int [10];
        int r =0;
        int t ;
        Libro [] libro = new Libro [10];
        int contador =0;

        do{
            System.out.println("\tMenu");
            System.out.println("1. Ingresar nuevo libro");
            System.out.println("2. Ver favoritos");
            System.out.println("3. Ver autores con sus libros");
            System.out.println("4. Salir");

            opc=scan.nextInt();


            switch(opc){
                case 1:
                    if(Autor.c<=10){
                        System.out.println("\tNuevo libro: " + (Autor.c+1));
                        scan.nextLine();
                        System.out.println("Autor: ");
                        String nombre_aut= scan.nextLine();
                        System.out.println("Pais: ");
                        String pais= scan.nextLine();
                        System.out.print("\n");

                        System.out.println("\tLIBROS");

                        System.out.println("Titulo: ");
                        String titulo= scan.nextLine();
                        System.out.println("Año: ");
                        int anio= scan.nextInt();
                        System.out.println("Favorito: ");
                        String dec= scan.next();

                        if(dec.equals("si") || dec.equals("SI")){


                            Autor.list_fav[c2]=Autor.c;

                            c2++;
                            
                            System.out.println("Añadido a favoritos");
                            System.out.print("\n");

                        }


                        libro[Autor.c]= new Libro(titulo,anio);
                        lista_aut[Autor.c]= new Autor(nombre_aut, pais, libro);

                        Autor.c++;

                    }

                    break;

                case 2:
                    
                    Autor.favorito = false;
                    
                    System.out.println("\tLISTA DE FAVORITOS ");
                    

                    for ( Autor.i=0 ; Autor.i<c2 ; Autor.i++){
                        
                        System.out.println("Libro favorito " + (Autor.i+1));
                        System.out.println(  lista_aut[Autor.list_fav[Autor.i]]);
                        System.out.print("\n");
                    }

                    break;

                case 3:
                    Autor.c3=0;

                    Autor.favorito = true;
                    for(int h =0; h<Autor.c ; h++){

                        System.out.println("Libro " +(h+1));
                        System.out.println( lista_aut[h]);
                        Autor.c3++;
                        System.out.print("\n");
                    }
                    
                    r=0;
                    for ( t = 0; t < Autor.c; t++) {
                        
                        contador=0;
                        canterior =true;
                        
                        for (int p = 0; p < t; p++) {
                            
                            
                            
                            if (lista_aut[t].equals(lista_aut[p])){
                                canterior = false;
                            }
                               
                        }
                        
                        if (canterior == true){
                        for (int o = t; o < Autor.c; o++) {
                            
                            if (lista_aut[t].equals(lista_aut[o])){
                                contador++;
                                nlibros [r]=contador;
                                
                            }
                            
                        }
                        
                        r++;
                           
                        
                        
                        }
                    }
                    
                     System.out.println( "r :" +r );
                    
                    for (int y = 0; y < r; y++) {
                                
                                System.out.println("N. Libros del Autor "+ (y+1) + " :"+nlibros [y] );
                                
                            }
                    
                    

                    break;
                case 4:
                    
                    System.out.println("Adios");
                    break;
                default:

                    break;
            }
        }while(opc!=4);


    }

}
