package com.angelika.lesson_35

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.angelika.lesson_35.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private val animeList = listOf(
        Anime(
            R.drawable.attack,
            "Атака титанов",
            "  Это популярное аниме, действие которого разворачивается в альтернативном мире, где человечество борется за выживание против гигантских существ, известных как \"титаны\"."
        ),
        Anime(
            R.drawable.naruto,
            "Наруто",
            "  \"Наруто\" - история о молодом ниндзя Наруто, который мечтает стать Хокаге и добиться признания. Вместе с друзьями, он сражается против врагов, раскрывает тайны своего мира и ищет свое место в нем."
        ),
        Anime(
            R.drawable.volleyball,
            "Волейбол",
            "  Это история о Хинате Шоё, маленьком парне, который мечтает стать великим волейболистом, несмотря на свой невысокий рост. Он присоединяется к волейбольной команде своей школы и вместе с командой борется на соревнованиях с различными соперниками. Через трудности, тренировки и дружбу, Хината и его команда стремятся достичь вершин в мире волейбола и преодолеть свои собственные ограничения. В процессе развития сюжета выявляются сильные стороны каждого игрока, формируются сильные соперничества и укрепляются связи внутри команды. Аниме \"Волейбол\" известно своей динамичной игровой атмосферой, напряженными матчами и эмоциональным развитием персонажей."
        ),
        Anime(
            R.drawable.demon,
            "Клинок рассекающий демонов",
            "   \"Клинок, рассекающий демонов\" - история о Танджиро, охотнике на демонов, который ищет способ вернуть свою сестру в человеческую форму и мстит за убийство своей семьи. В ходе своего путешествия он сталкивается с мощными демонами и другими охотниками."
        ),
        Anime(
            R.drawable.welcome,
            "Добро пожаловать в класс превосходства",
            "    История о студентах, которым предстоит преодолеть сложные испытания и соревнования в престижной школе, где оцениваются не только учебные успехи, но и социальные навыки."
        ),
        Anime(
            R.drawable.chorimia,
            "Хоримия",
            "   Это романтическое аниме о двух старшеклассниках, Кёко Хори и Изуми Миямото, которые скрывают свои истинные личности за масками хорошо себя ведущих учеников. Однажды они случайно обнаруживают друг друга вне школы и узнают о своих скрытых интересах и странностях. Вместе они начинают проводить время и открывают друг другу свои истинные себя, в результате чего развивается их взаимопонимание, дружба и возможно, даже что-то большее. \"Хоримия\" исследует темы подростковых отношений, самопринятия и нахождения счастья в своей уникальности. Аниме известно своими милыми и моментами юмора, а также заставляет задуматься о том, как важно быть самим собой и открытым перед другими людьми."
        ),
        Anime(
            R.drawable.level,
            "Моя любовь 999-уровня к Ямаде Куну",
            "  Это комедийная и романтическая история о Рю Ямаде и его приключениях в школе. Рю Ямаде, непопулярный старшеклассник, случайно сталкивается с Урарой Шираиши и они обнаруживают, что могут менять тела при поцелуе. Вместе они исследуют это явление и осознают, что это связано с магией. В ходе истории они сталкиваются с другими учениками, также обладающими магическими способностями. \"Моя любовь 999 уровня к Ямаде-куну\" исследует темы дружбы, первой любви и самопознания. Аниме известно своим юмором, неожиданными поворотами сюжета и динамичными отношениями между персонажами."
        ),
        Anime(
            R.drawable.basketball,
            "Баскетбол",
            "   \"Баскетбол\" - история о Куроко Тецуе и его команде, которые сражаются в баскетболе, чтобы преодолеть сильнейшие команды и достичь высот успеха. Аниме исследует темы дружбы, сотрудничества и страсти к спорту."
        ),
    )

    private val animeAdapter = AnimeAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvAnime.adapter = animeAdapter
        animeAdapter.setData(animeList)
    }
}