import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

object Colors {
    object ThemeColorScheme {
        //亮色
        val blueColorScheme = lightColorScheme(
            primary = Color(0xFF3F51B5), // 深蓝色
            onPrimary = Color.White, // 主色上的文字颜色
            primaryContainer = Color(0xFFE8EAF6), // 主色的容器背景
            onPrimaryContainer = Color(0xFF3F51B5), // 主色容器上的文字颜色
            secondary = Color(0xFF03A9F4), // 辅助色
            onSecondary = Color.White, // 辅助色上的文字颜色
            secondaryContainer = Color(0xFFDFF4FF), // 辅助色的容器背景
            onSecondaryContainer = Color(0xFF03A9F4), // 辅助色容器上的文字颜色
            tertiary = Color(0xFF00BCD4), // 第三色
            onTertiary = Color.White, // 第三色上的文字颜色
            tertiaryContainer = Color(0xFFE0F7FA), // 第三色的容器背景
            onTertiaryContainer = Color(0xFF00BCD4), // 第三色容器上的文字颜色
            error = Color(0xFFB71C1C), // 错误色
            onError = Color.White, // 错误色上的文字颜色
            errorContainer = Color(0xFFFFCDD2), // 错误色的容器背景
            onErrorContainer = Color(0xFFB71C1C), // 错误色容器上的文字颜色
            background = Color.White, // 背景色
            onBackground = Color.Black, // 背景上的文字颜色
            surface = Color.White, // 表面色
            onSurface = Color.Black, // 表面色上的文字颜色
            inverseSurface = Color.Black, // 反转表面色
            inverseOnSurface = Color.White, // 反转表面色上的文字颜色
            inversePrimary = Color.White // 反转主色
        )
    }
}