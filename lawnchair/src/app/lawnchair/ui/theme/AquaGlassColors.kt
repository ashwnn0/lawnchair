package app.lawnchair.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color

/**
 * Aqua Glass accent palette: cool cyan and sea-glass tones inspired by classic
 * translucent desktop interfaces. Surface transparency is handled by individual
 * launcher surfaces so text contrast and wallpaper visibility remain controllable.
 */
internal fun ColorScheme.withAquaGlassAccents(darkTheme: Boolean): ColorScheme = copy(
    primary = if (darkTheme) Color(0xFF83DFF0) else Color(0xFF087F9C),
    onPrimary = if (darkTheme) Color(0xFF003640) else Color(0xFFFFFFFF),
    primaryContainer = if (darkTheme) Color(0xFF075568) else Color(0xFFC5F1F8),
    onPrimaryContainer = if (darkTheme) Color(0xFFC5F1F8) else Color(0xFF003640),
    secondary = if (darkTheme) Color(0xFF9ADBCB) else Color(0xFF287F70),
    onSecondary = if (darkTheme) Color(0xFF00382F) else Color(0xFFFFFFFF),
    secondaryContainer = if (darkTheme) Color(0xFF164F45) else Color(0xFFD0F2E9),
    onSecondaryContainer = if (darkTheme) Color(0xFFD0F2E9) else Color(0xFF062F29),
    tertiary = if (darkTheme) Color(0xFFA9C9FF) else Color(0xFF426FAE),
    onTertiary = if (darkTheme) Color(0xFF102F58) else Color(0xFFFFFFFF),
    tertiaryContainer = if (darkTheme) Color(0xFF294A75) else Color(0xFFDCE9FF),
    onTertiaryContainer = if (darkTheme) Color(0xFFDCE9FF) else Color(0xFF102F58),
    surfaceTint = if (darkTheme) Color(0xFF83DFF0) else Color(0xFF087F9C),
)
