package com.atomicrobot.inputfieldsstarter.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import com.atomicrobot.inputfieldstutorial.R

val defaultFonts = FontFamily(
    Font(R.font.test_geograph_black),
    Font(R.font.test_geograph_black_italic),
    Font(R.font.test_geograph_bold, weight = FontWeight.Bold),
    Font(R.font.test_geograph_light, weight = FontWeight.Light),
    Font(R.font.test_geograph_bold_italic),
    Font(R.font.test_geograph_light_italic),
    Font(R.font.test_geograph_medium, weight = FontWeight.Medium),
    Font(R.font.test_geograph_medium_italic),
    Font(R.font.test_geograph_regular, weight = FontWeight.Normal),
    Font(R.font.test_geograph_regular_italic),
    Font(R.font.test_geograph_thin, weight = FontWeight.Thin),
    Font(R.font.test_geograph_thin_italic),
)

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val KarlaFont = GoogleFont(name = "Karla")

val karlaFonts = FontFamily(
    Font(googleFont = KarlaFont, fontProvider = provider),
)

// Set of Material typography styles to start with
val typography = Typography(
    bodyMedium = TextStyle(
        fontFamily = defaultFonts,
        fontWeight = FontWeight.Normal,
        lineHeight = 24.sp,
        fontSize = 16.sp
    )
)