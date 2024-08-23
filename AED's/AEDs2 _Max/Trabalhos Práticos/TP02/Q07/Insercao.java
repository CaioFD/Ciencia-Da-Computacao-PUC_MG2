/*
 *  //--------- Documentação ---------//
 *  
 *  TP02Q01 - 27 / 04 / 2024
 *  Author: Caio Faria Diniz
 *  
*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.time.format.DateTimeFormatter;


//-------Classe Log-------//


class Log{
    protected int comparacoes;
    protected int movimentacoes;
    protected double tempo;
    protected String fileName;
    
    Log( ) {
        this.comparacoes = -1;
        this.movimentacoes = -1;
        this.tempo = -1.0; 
        this.fileName = null;
    }

    Log( String fileName )
    {
        this.comparacoes = -1;
        this.movimentacoes = -1;
        this.tempo = -1.0; 
        this.fileName = fileName;
    }

    int getComp ( ) 
    { 
        return( this.comparacoes ); 
    }

    int getMov ( ) 
    { 
        return( this.movimentacoes ); 
    }

    double getTime ( ) 
    { 
        return( this.tempo ); 
    }
    
    void setComp ( int comp ) 
    { 
        this.comparacoes = comp; 
    }

    void setMov ( int mov ) 
    { 
        this.movimentacoes = mov ; 
    }

    void   setTime ( double time ) 
    { 
        this.tempo = time; 
    }

    public void incrementarComp( )
    { 
        this.comparacoes++ ; 
    }

    public void incrementarMov( ) 
    { 
        this.movimentacoes++; 
    }

    public void registro( )
    {
        try {
            FileWriter writer = new FileWriter(this.fileName);
            writer.write( "793605\t" + "Comparacoes: "+getComp()+"\t" + "Movimentacoes: "+getMov()+"\t" 
            + "Tempo de Execucao (ms): "+getTime()+"\n" );
            writer.close();
        }  
        catch( Exception e ) {
            System.out.println("Erro ao escrever o log no arquivo: " + e.getMessage());
        }
    }
}


//-------Classe Personagem-------//


class Personagem 
{

    //-------Atributos-------//

    
    private String    id  ; 
    private String    name  ; 
    private String[]  alternateNames  ; 
    private String    house ; 
    private String    ancestry ; 
    private String    species ; 
    private String    patronus ; 
    private Boolean   hogwartsStaff ;  
    private Boolean   hogwartsStudent ;  
    private String    actorName ; 
    private Boolean   alive ;
    private String[]  alternateActors ;
    private LocalDate dateOfBirth ; 
    private int       yearOfBirth ; 
    private String    eyeColour  ; 
    private String    gender ; 
    private String    hairColour  ; 
    private Boolean   wizard  ; 


    // ---------------- Construtores -------------------//

    
    Personagem ( )
    {
        this.id  = "" ;              
        this.name  = "" ;            
        this.alternateNames  = null  ; 
        this.house  = "" ;           
        this.ancestry  = ""  ;        
        this.species  = "" ;         
        this.patronus  = "" ;        
        this.hogwartsStaff   = false ;   
        this.hogwartsStudent = false ; 
        this.actorName = "" ;       
        this.alive  = false ;
        this.alternateActors = null ;           
        this.dateOfBirth = LocalDate.of(-1, 1, 1);
        this.yearOfBirth = -1 ;     
        this.eyeColour  = "" ;       
        this.gender = "" ;          
        this.hairColour = "" ;      
        this.wizard   = false ;          
    } 


    Personagem ( String    id         , String  name         , String[]  alternateNames , 
                 String    house      , String  ancestry     , String    species        , 
                 String    patronus   , Boolean hogwartsStaff, Boolean   hogwartsStudent, 
                 String    actorName  , Boolean alive        , String[]  alternateActors,
                 LocalDate dateOfBirth, int     yearOfBirth  , String    eyeColour      , 
                 String    gender     , String  hairColour   , Boolean   wizard )
    {
        this.id  = id ;
        this.name  = name ;
        this.alternateNames  = alternateNames  ;
        this.house  = house  ;
        this.ancestry  = ancestry ;
        this.species  = species ;
        this.patronus  = patronus ;
        this.hogwartsStaff = hogwartsStaff ;
        this.hogwartsStudent = hogwartsStudent ;
        this.actorName = actorName ;
        this.alive  = alive ;
        this.alternateActors = alternateActors ;
        this.dateOfBirth = dateOfBirth ;
        this.yearOfBirth  = yearOfBirth  ;
        this.eyeColour  = eyeColour  ;
        this.gender  = gender  ;
        this.hairColour  = hairColour  ;
        this.wizard  = wizard ;
    } 

    //--------- GET ---------//

    public String getId( ) 
    { 
        return ( this.id );
    }

    public String getName( ) 
    { 
        return ( this.name); 
    }

    public String[] getAlternateNames  ( ) 
    { 
        return ( this.alternateNames ); 
    }

    public String[] getAlternateActors  ( ) 
    { 
        return ( this.alternateActors ); 
    }

    public String getHouse( ) 
    { 
        return ( this.house ); 
    }

    public String getAncestry( ) 
    { 
        return ( this.ancestry ); 
    }

    public String getSpecies( ) 
    { 
        return ( this.species ); 
    }

    public String getPatronus( ) 
    { 
        return ( this.patronus ); 
    }

    public Boolean getHogwartsStaff( ) 
    { 
        return ( this.hogwartsStaff ); 
    }

    public Boolean getHogwartsStudent( ) 
    {
        return ( this.hogwartsStudent ); 
    }

    public String getActorName( ) 
    { 
        return ( this.actorName ); 
    }

    public Boolean getAlive( ) 
    { 
        return ( this.alive ); 
    }

    public LocalDate getDateOfBirth( ) 
    { 
        return ( this.dateOfBirth ); 
    }

    public int getYearOfBirth( ) 
    { 
        return ( this.yearOfBirth ); 
    }

    public String getEyeColour( ) 
    { 
        return ( this.eyeColour ); 
    }

    public String getGender( ) 
    { 
        return ( this.gender ); 
    }

    public String getHairColour( ) 
    { 
        return ( this.hairColour ); 
    }

    public Boolean getWizard( ) 
    { 
        return ( this.wizard ); 
    }

    
   //--------- SET ---------//
    

    public void setId( String id ) 
    { 
        this.id = id ; 
    }

    public void setName( String name ) 
    { 
        this.name = name ; 
    }

    public void setAlternateNames( String[] alternateNames ) 
    { 
        this.alternateNames  = alternateNames ; 
    }

    public void setAlternateActors( String[] alternateActors ) 
    { 
        this.alternateActors  = alternateActors ; 
    }

    public void setHouse( String house )
    {
        this.house  = house ; 
    }

    public void setAncestry( String ancestry ) 
    { 
        this.ancestry = ancestry ; 
    }

    public void setSpecies( String species ) 
    {
        this.species  = species  ; 
    }

    public void setPatronus( String patronus ) 
    { 
        this.patronus = patronus ; 
    }

    public void setHogwartsStaff( Boolean hogwartsStaff ) 
    { 
        this.hogwartsStaff  = hogwartsStaff ; 
    }

    public void setHogwartsStudent( Boolean hogwartsStudent ) 
    { 
        this.hogwartsStudent = hogwartsStudent ; 
    }
    
    public void setActorName( String actorName ) 
    { 
        this.actorName = actorName ; 
    }

    public void setAlive( Boolean alive ) 
    {
        this.alive  = alive ; 
    }

    public void setDateOfBirth( LocalDate dateOfBirth ) 
    { 
        this.dateOfBirth = dateOfBirth ; 
    }

    public void setYearOfBirth( int YearOfBirth ) 
    { 
        this.yearOfBirth  = yearOfBirth ; 
    }
    
    public void setEyeColour( String eyeColour ) 
    { 
        this.eyeColour = eyeColour ; 
    }

    public void setGender( String gender ) 
    { 
        this.gender = gender ; 
    }

    public void setHairColour( String hairColour ) 
    { 
        this.hairColour = hairColour ; 
    }

    public void setWizard( Boolean wizard ) 
    { 
        this.wizard = wizard ; 
    }
    
    public void set(String    id         , String  name         , String[] alternateNames , 
    String    house      , String  ancestry     , String   species        , 
    String    patronus   , Boolean hogwartsStaff, Boolean  hogwartsStudent, 
    String    actorName  , Boolean alive        , String[] alternateActors,
    LocalDate dateOfBirth, int     yearOfBirth  , String   eyeColour      , 
    String    gender     , String  hairColour   , Boolean  wizard)
{
setId              ( id );
setName            ( name );
setAlternateNames  ( alternateNames );
setHouse           ( house );
setAncestry        ( ancestry );
setSpecies         ( species );
setPatronus        ( patronus );
setHogwartsStaff   ( hogwartsStaff );
setHogwartsStudent ( hogwartsStudent );
setActorName       ( actorName );
setAlive           ( alive );
setAlternateActors ( alternateActors );
setDateOfBirth     ( dateOfBirth );
setYearOfBirth     ( yearOfBirth );
setEyeColour       ( eyeColour );
setGender          ( gender );
setHairColour      ( hairColour );
setWizard          ( wizard );
} //end
    
   //--------- Métodos Uteis ---------//

    public String[] tratamentoArrayString ( String str ) 
    {  
        String [] array = null;
        if( str == null ) {
            array = null;
        }
        else
        {
            String tratada = "";
            for( int x = 0; x < str.length( ); x = x + 1 )
            {
                if( str.charAt(x) == '[' ) {
                    tratada = tratada + '{';
                } else if( str.charAt(x) == ']' ) {
                    tratada = tratada + '}';
                } else if ( str.charAt(x) == '\'' ) {
                    tratada = tratada + "";
                } else {
                    tratada = tratada + str.charAt(x);
                }
            } 
            array = tratada.split( "," );
        } 
        return ( array );
    } // end


    public LocalDate tratamentoDate ( String str ) 
    {        
        return ( LocalDate.parse( str, DateTimeFormatter.ofPattern("dd-M-yyyy") ) );
    }


    public Boolean tratamentoBool( String str )
    {
        if( str.equals("VERDADEIRO") || str.equals("true") || str.equals("1") )
            return ( true );
        else
            return ( false );
    }


    public int tratamentoInt( String str ) {
        return ( Integer.parseInt( str ) );
    }


    public String altNamesToString ( ) 
    {
        String result = "";
        if( alternateNames == null ) {
            result = "{}";
        }
        else
        {
            for( int x = 0; x < this.alternateNames.length; x++ )
            {
                if( x < this.alternateNames.length-1 ) {
                    result = result + this.alternateNames[x] + ",";
                }
                else {        
                    result = result + this.alternateNames[x];
                }
            } 
        } 
        return( result );
    }


    public String dateBirthToString ( )
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = this.dateOfBirth.format(formatter);
        return ( date );
    }
    
    //--------- Metodos Gerais ---------//



    public static boolean isFim( String s )
    {
        boolean result = false;
        if( s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M' )
        {
            result = true;
        }
        return ( result );
    } 

    @Override
    public String toString( ) 
    {
        String toString = "";
        toString =  getId         ( ) + " ## " + getName         ( ) + " ## " + altNamesToString  ( ) + " ## " + 
                    getHouse      ( ) + " ## " + getAncestry     ( ) + " ## " + getSpecies        ( ) + " ## " + 
                    getPatronus   ( ) + " ## " + getHogwartsStaff( ) + " ## " + getHogwartsStudent( ) + " ## " + 
                    getActorName  ( ) + " ## " + getAlive        ( ) + " ## " + dateBirthToString ( ) + " ## " + 
                    getYearOfBirth( ) + " ## " + getEyeColour    ( ) + " ## " + getGender         ( ) + " ## " + 
                    getHairColour ( ) + " ## " + getWizard       ( ); 
		return ( toString );
	} 


   
    public Personagem clone ( ) //clona um personagem
    {
        Personagem clone = new Personagem( );
        clone.setId             ( getId() );       
        clone.setName           ( getName() );         
        clone.setAlternateNames ( getAlternateNames() );  
        clone.setHouse          ( getHouse() );           
        clone.setAncestry       ( getAncestry() );        
        clone.setSpecies        ( getSpecies() );         
        clone.setPatronus       ( getPatronus() );        
        clone.setHogwartsStaff  ( getHogwartsStaff() );   
        clone.setHogwartsStudent( getHogwartsStudent() );
        clone.setActorName      ( getActorName() );       
        clone.setAlive          ( getAlive() );           
        clone.setDateOfBirth    ( getDateOfBirth() );     
        clone.setYearOfBirth    ( getYearOfBirth() );     
        clone.setEyeColour      ( getEyeColour() );       
        clone.setGender         ( getGender() );          
        clone.setHairColour     ( getHairColour() );      
        clone.setWizard         ( getWizard() );
        return ( clone );
    } //end



    public void imprimir ( )//imprimir personagem
    {
        System.out.println( "[" + toString( ) + "]" );
    }


    public Personagem ler ( String id )//ler atributos
    {
        Personagem perso = new Personagem( );
        String path = "/tmp/characters.csv";
        try 
        { 
            File file = new File( path );
            Scanner scan = new Scanner( file );
            
            scan.nextLine( ); 
            
            boolean found = false;
            while( scan.hasNextLine() && !found )
            {
                String input = scan.nextLine( );
                if( id.equals( input.substring( 0, input.indexOf( ";" ) ) ) )
                {
                    found = true;
                    String [] atributos = input.split( ";" );
                    perso.set(  atributos[0], atributos[1], tratamentoArrayString(atributos[2]),
                                atributos[3], atributos[4], atributos[5], atributos[6],
                                tratamentoBool(atributos[7]), tratamentoBool(atributos[8]), atributos[9], 
                                tratamentoBool(atributos[10]), tratamentoArrayString(atributos[11]),
                                tratamentoDate(atributos[12]) , tratamentoInt(atributos[13]),
                                atributos[14],atributos[15], atributos[16], tratamentoBool(atributos[17])  );
                } 
            } 

            if( !found ) {
                System.out.println( "Character Not Found." );
            } 

            scan.close( );
        } 
        catch( FileNotFoundException e ) {
            System.out.println( "ERROR: File Not Found." );
        } 
        return ( perso );
    } 


    public static void swap( int i, int j, List<Personagem> perso ) 
    {
        Personagem temp = perso.get(i);
        perso.set( i, perso.get(j) );
        perso.set( j, temp );
    } 


    public static int CompararDatas( Personagem perso1, Personagem perso2)
    {
        int result = 0;
        LocalDate date1 = perso1.getDateOfBirth();
        LocalDate date2 = perso2.getDateOfBirth();

        if(date1.isBefore(date2) ){
            result = -1;
        }
        else if(date1.isAfter(date2) ){
            result = 1;
        }
        else{ // d1 vai ser igual a d2
            if( perso1.getName().compareTo(perso2.getName()) > 0 ){
                result = 1;
            }
            else{
                result = -1;
            }
        }
        return ( result );
    }// end

                //-------InserctionSort-------//

    public static void InserctionSort( List<Personagem> perso, Log log ) {
        for (int i = 1; i < perso.size(); i++) {
            Personagem tmp = perso.get(i) ;
            int j = i - 1;
            
                while ((j >= 0) && CompararDatas(perso.get(j), tmp) > 0 ) {
                    perso.set(j + 1 , perso.get(j)) ;
                    j--;
                }
                    perso.set(j + 1, tmp) ;
        }
    }// end insercao
}


public class Insercao extends Personagem
{
    public static void main ( String [] args )
    {
        Scanner scan = new Scanner( System.in );
        
        Log log = new Log( "793605_insercao.txt" );
        Personagem perso = new Personagem( );
        List<Personagem> arranjo = new ArrayList<>( );

        String input = scan.nextLine( );
        while( !isFim( input ) )
        {
            arranjo.add( perso.ler( input ) );
            input = scan.nextLine( );
        }

        long startTime = System.nanoTime();
        InserctionSort( arranjo, log );
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        double time = totalTime / 1_000_000.0;
        log.setTime( time );
        log.registro();
        scan.close( );

        for(Personagem personagem : arranjo) {
            personagem.imprimir( );
        } 
    } 
}//end main