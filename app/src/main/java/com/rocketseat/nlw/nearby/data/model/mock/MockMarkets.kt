package com.rocketseat.nlw.nearby.data.model.mock

import com.rocketseat.nlw.nearby.data.model.Market

val mockMarkets = listOf(
    Market(
        id = "012576ea-4441-4b8a-89e5-d5f32104c7c4",
        categoryId = "146b1a88-b3d3-4232-8b8f-c1f006f1e86d",
        name = "Sabor Grill",
        description = "Churrascaria com cortes nobres e buffet variado. Experiência completa para os amantes de carne.",
        coupons = 10,
//        rules = listOf(
//            Rule(id = "1", description = "Válido até o dia 25/12", marketId = "012576ea-4441-4b8a-89e5-d5f32104c7c4"),
//            Rule(id = "2", description = "Disponível apenas para consumo local", marketId = "012576ea-4441-4b8a-89e5-d5f32104c7c4")
//        ),
        latitude = -23.55974230991911,
        longitude = -46.65814845249887,
        address = "Av. Paulista - Bela Vista",
        phone = "(11) 94567-1212",
        cover = "https://images.unsplash.com/photo-1498654896293-37aacf113fd9?w=400&h=300"
    ),
    Market(
        id = "2bc11e34-5f30-4ba0-90fa-c1c98f649281",
        categoryId = "146b1a88-b3d3-4232-8b8f-c1f006f1e86d",
        name = "Café Central",
        description = "Café aconchegante com opções de lanches e bebidas artesanais. Perfeito para uma pausa.",
        coupons = 10,
//        rules = emptyList(),
        latitude = -23.559457108504436,
        longitude = -46.66252581753144,
        address = "Alameda Jaú - Jardim Paulista",
        phone = "(12) 3456-7890",
        cover = "https://images.unsplash.com/photo-1551218808-94e220e084d2?w=400&h=300"
    )
)