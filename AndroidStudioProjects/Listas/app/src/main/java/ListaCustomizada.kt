import android.app.Activity
import android.os.Bundle
import android.widget.ListView


class ListaCustomizada : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_customizada)

        val listaContatos = ArrayList<Contato>()
        val c1 = Contato(1L, "Collor", "color@br.com", "Alagoas")
        val c2 = Contato(2L, "Dilma", "dilma@br.com", "Porto Alegre")

        listaContatos.add(c1)
        listaContatos.add(c2)

        val adapter = ContatoAdapter(applicationContext, listaContatos)
        val listaCustomizada:ListView = lista
        //val lista = findViewById<ListView>(R.id.lista)
        lista.setAdapter(adapter)
    }
}

