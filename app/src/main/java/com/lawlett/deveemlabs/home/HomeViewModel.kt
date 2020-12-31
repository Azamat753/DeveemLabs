package com.lawlett.deveemlabs.home

import androidx.lifecycle.ViewModel
import com.lawlett.deveemlabs.model.ItemModel

class HomeViewModel : ViewModel() {
    private val list: MutableList<ItemModel> = mutableListOf()

    fun getData():MutableList<ItemModel>{
        list.add(ItemModel("Продаю сухофрукты,оптом",10,230,180,"Свежие с огорода","04 Мая,2020","KGZ","Джалал-Абад","за 4 кг","https://n1s1.elle.ru/60/10/b2/6010b2e93dd60fc28bd7663d2595f3e1/940x629_0xc35dbb80_6090169761504797994.jpeg"))
        list.add(ItemModel("Продаю машину",1,240,3000,"Красного цвета,легковая","12 Апреля","USD","Джалал-Абад","за 2 кг","https://img.etimg.com/thumb/msid-73268134,width-640,resizemode-4,imgsize-35417/surprise-heard-of-a-sony-car.jpg"))
        list.add(ItemModel("Продаю телефон",3,2000,4000,"Масло,новый","31 декабря 2020","KGZ","Бишкек","за 1 кг","https://www.ixbt.com/img/n1/news/2020/8/5/xiaomi-mi-10-1-of-28_large.jpg"))
        list.add(ItemModel("Продаю кофемашину",20,245,9000,"Б/У в хорошем состоянии","12 Марта,2019","KGZ","Бишкек","за 2 кг","https://kupi.kg/cache/files/31055.jpg_w380_h380_resize.jpg"))
        list.add(ItemModel("Продаю дом",9,2401,2000,"4 х этажный","14 Мая,2019","EURO","Талас","за 3 кг","https://ruplans.ru/cms_files/98/184/4942/view-image.jpg"))
        list.add(ItemModel("Продаю PS4",30,2031,1000,"2 джойстика в подарок","25 Октября,2020","USD","Баткен","за 2 кг","https://3dnews.ru/assets/external/illustrations/2020/02/04/1002911/10.jpg"))
        list.add(ItemModel("Продаю пони",40,12004,5000,"2 года","24 Сентября,2019","USD","Чуй","за 5 кг","https://i0.wp.com/ihappymama.ru/wp-content/uploads/2016/02/pony-591969_640.jpg?ssl=1"))
        list.add(ItemModel("Продаю воздух",1204,124004,1000,"В баночке","21 Апреля,2010","KGZ","Бишкек","за 6 кг","https://static.kulturologia.ru/files/u1866/canned_air_1.jpg"))
        list.add(ItemModel("Продаю печку",5,421,8000,"Хорошо топит","23 Марта,2012","KGZ","Нарын","за 7 кг","https://ethnomir.ru/upload/medialibrary/bff/pechka.jpg"))
        list.add(ItemModel("Продаю DVD",1000,4122,1000,"В рабочем состоянии","13 Марта,2019","RUB","Моска","за 8 кг","https://movietalker.net/wp-content/uploads/2020/06/5.jpg"))
        return list
    }
}