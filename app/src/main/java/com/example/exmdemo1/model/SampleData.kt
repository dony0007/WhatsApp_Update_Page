package com.example.exmdemo1.model

import com.example.exmdemo1.R

object SampleData {

    val statusDemo = listOf(
        StatusItemModel(R.drawable.dhoni,R.drawable.kohili,"Dhoni"),
        StatusItemModel(R.drawable.smriti,R.drawable.dhoni,"Smriti"),
        StatusItemModel(R.drawable.kohili,R.drawable.klrahul,"Kohili"),
        StatusItemModel(R.drawable.smriti,R.drawable.smriti,"Smriti"),
        StatusItemModel(R.drawable.dhoni,R.drawable.dhoni,"Dhoni"),
        StatusItemModel(R.drawable.smriti,R.drawable.klrahul,"Smriti")


    )


    val findDemo = listOf(
        FindItemModel(R.drawable.dhoni,"The Champions Trophy, which originally started in 1998 as the ‘Mini World Cup’, is played between top eight teams in the ICC ODI Rankings. The last edition was held in 2017 in England and Wales and in the interim, ICC couldn’t fit the tournament in an already packed calender for top cricket boards, who also now own lucrative T20 leagues.",R.drawable.smriti),
//        FindItemModel(R.drawable.smriti,R.drawable.dhoni),
        FindItemModel(R.drawable.kohili,"NEW DELHI: Indian Navy on Saturday successfu ..\n" +
                "\n" +
                "Read more at:\n" +
                "http://timesofindia.indiatimes.com/articleshow/108539294.cms?utm_source=contentofinterest&utm_medium=text&utm_campaign=cppst",R.drawable.dhoni)

    )



    val channelDemo = listOf(
        ChannelItemModel(R.drawable.t24_news,"TWENTY FOUR"),
        ChannelItemModel(R.drawable.smriti,"SMRITI"),
        ChannelItemModel(R.drawable.kohili,"VIRAT")

    )
}