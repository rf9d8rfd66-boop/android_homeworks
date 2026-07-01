package com.example.myapplication.repository

import com.example.myapplication.model.FilmModel

object DataRepository {
    var baseFilms = listOf(
        FilmModel(id = "1", imageUrl = "https://picsum.photos/200/300?rundom=1", name = "Titanic", description = "Drama", releaseDate = 1997),
        FilmModel(id = "2", imageUrl = "https://picsum.photos/200/300?rundom=2", name = "Avatar", description = "Sci-fi", releaseDate = 2010),
        FilmModel(id = "3", imageUrl = "https://picsum.photos/200/300?rundom=3", name = "Shrek", description = "Animation", releaseDate = 2001),
        FilmModel(id = "4", imageUrl = "https://picsum.photos/200/300?rundom=4", name = "The Matrix", description = "Sci-fi", releaseDate = 1999),
        FilmModel(id = "5", imageUrl = "https://picsum.photos/200/300?rundom=5", name = "Up", description = "Animation", releaseDate = 2009),
        FilmModel(id = "6", imageUrl = "https://picsum.photos/200/300?rundom=6", name = "Finding Nemo", description = "Animation", releaseDate = 2003),
        FilmModel(id = "7", imageUrl = "https://picsum.photos/200/300?rundom=7", name = "Toy Story", description = "Animation", releaseDate = 1995),
        FilmModel(id ="8", imageUrl = "https://picsum.photos/200/300?rundom=8", name = "Spider-Man", description = "adventure", releaseDate = 2002),
//        FilmModel(id = "1", imageUrl = "https://yandex.ru/images/search?pos=40&from=tabbar&img_url=https%3A%2F%2Fi.pinimg.com%2Foriginals%2F7b%2F96%2F71%2F7b967175f498db5c373936e071d00bb2.jpg%3Fnii%3Dt&text=заставка+титаник&rpt=simage&lr=11127", name = "Titanic", description = "Drama", releaseDate = 1997),
//        FilmModel(id = "2", imageUrl = "https://yandex.ru/images/search?pos=2&from=tabbar&img_url=https%3A%2F%2Fi.pinimg.com%2Fvideos%2Fthumbnails%2Foriginals%2F07%2F26%2Fc8%2F0726c8df59fa8260ddf1a19a38e1ba6f.0000000.jpg&text=заставка+аватар&rpt=simage&lr=11127", name = "Avatar", description = "Sci-fi", releaseDate = 2010),
//        FilmModel(id = "3", imageUrl = "https://yandex.ru/images/search?text=заставка+ihtr&pos=1&rpt=simage&img_url=https%3A%2F%2Fir.ozone.ru%2Fs3%2Fmultimedia-y%2F6701061274.jpg&from=tabbar&lr=11127", name = "Shrek", description = "Animation", releaseDate = 2001),
//        FilmModel(id = "4", imageUrl = "https://yandex.ru/images/search?text=заставка+abkmvf+vfnhbwf&pos=16&rpt=simage&img_url=https%3A%2F%2Fprosto-poster.ru%2Fimg-wiki%2Fwmc-mtx-5d1c74734%2Fwebp%2F1500%2Fwmc-mtx-5d1c74734_3.webp&from=tabbar&lr=11127", name = "The Matrix", description = "Sci-fi", releaseDate = 1999),
//        FilmModel(id = "5", imageUrl = "https://yandex.ru/images/search?text=заставка+фильма+up&pos=0&rpt=simage&img_url=https%3A%2F%2Fcdn4.telegram-cdn.org%2Ffile%2FmxBbm-0meKFbBR1CcbHduatpwsWvaA0hrIPgwO2ukAUQpTUigFP3vECWxpuMQH1aDKgnz8JYCLcLCabaoOmRklipioNLOJs7CM9mMOuYiNlz-v7wUPvqrHHu-9dUVYL7Qo0J-YPiG6Ihzv_YkeDYYaY3SMxtfBi3AGwldOpbA9w6cDEB-4pDpoJE5lUQd0QZadUjVMF63NVjjGCyWd69pIeib30VE86JNZx57xd7anBOnRFl3aulmrmoIHS6OaFSw8JdXp14F4_lqTa834zh7F-zcV1mQfGZaA39Cq3CQiYNkwJui_tUfmMa8wYiIXGgK6o6qSAwHIw2ouFA06aouQ.jpg&from=tabbar&lr=11127", name = "Up", description = "Animation", releaseDate = 2009),
//        FilmModel(id = "6", imageUrl = "https://yandex.ru/images/search?text=заставка+фильма+d+gjbcrf%5B+ytvjk&pos=1&rpt=simage&img_url=https%3A%2F%2Fwww.tiktok.com%2Fapi%2Fimg%2F%3FitemId%3D7595205323384786198%26location%3D0%26aid%3D1988&from=tabbar&lr=11127", name = "Finding Nemo", description = "Animation", releaseDate = 2003),
//        FilmModel(id = "7", imageUrl = "https://yandex.ru/images/search?text=заставка+фильма+Toy+Story&pos=1&rpt=simage&img_url=https%3A%2F%2Fimages-wixmp-ed30a86b8c4ca887773594c2.wixmp.com%2Ff%2F6382a671-ba6c-4977-a4ae-5296835ee7db%2Fdlrmdhb-14ddf5ec-74c2-4560-8d7d-fe577638bd89.png%2Fv1%2Ffill%2Fw_528%2Ch_670%2Cq_80%2Cstrp%2Ftoy_story___poster_by_ericgthompsonarts_dlrmdhb-fullview.jpg%3Ftoken%3DeyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9NjcwIiwicGF0aCI6Ii9mLzYzODJhNjcxLWJhNmMtNDk3Ny1hNGFlLTUyOTY4MzVlZTdkYi9kbHJtZGhiLTE0ZGRmNWVjLTc0YzItNDU2MC04ZDdkLWZlNTc3NjM4YmQ4OS5wbmciLCJ3aWR0aCI6Ijw9NTI4In1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0.7Ty7P3fg1UGQVqXjKTgb6W-TwbYfn1jhgIA9EhBFDrA&from=tabbar&lr=11127", name = "Toy Story", description = "Animation", releaseDate = 1995),
//        FilmModel(id ="8", imageUrl = "https://yandex.ru/images/search?pos=2&from=tabbar&img_url=https%3A%2F%2Fir.ozone.ru%2Fs3%2Fmultimedia-1-a%2F7119002530.jpg&text=человек+паук+заставка&rpt=simage&lr=11127", name = "Spider-Man", description = "adventure", releaseDate = 2002),

        FilmModel(id = "1", imageUrl = "https://picsum.photos/200/300?rundom=1", name = "Titanic", description = "Drama", releaseDate = 1997),
        FilmModel(id = "2", imageUrl = "https://picsum.photos/200/300?rundom=2", name = "Avatar", description = "Sci-fi", releaseDate = 2010),
        FilmModel(id = "3", imageUrl = "https://picsum.photos/200/300?rundom=3", name = "Shrek", description = "Animation", releaseDate = 2001),
        FilmModel(id = "4", imageUrl = "https://picsum.photos/200/300?rundom=4", name = "The Matrix", description = "Sci-fi", releaseDate = 1999),
        FilmModel(id = "5", imageUrl = "https://picsum.photos/200/300?rundom=5", name = "Up", description = "Animation", releaseDate = 2009),
        FilmModel(id = "6", imageUrl = "https://picsum.photos/200/300?rundom=6", name = "Finding Nemo", description = "Animation", releaseDate = 2003),
        FilmModel(id = "7", imageUrl = "https://picsum.photos/200/300?rundom=7", name = "Toy Story", description = "Animation", releaseDate = 1995),
        FilmModel(id ="8", imageUrl = "https://picsum.photos/200/300?rundom=8", name = "Spider-Man", description = "adventure", releaseDate = 2002),
    )

    var filmsList = listOf<FilmModel>()
}