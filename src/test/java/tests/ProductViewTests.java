package tests;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.automationpractice.HomePage;
import pages.automationpractice.products.CategoryPage;
import pages.automationpractice.products.ProductPage;
import tests.base.Pages;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductViewTests extends Pages {
    private static final Logger logger = LoggerFactory.getLogger(ProductViewTests.class);

    @Test
    public void productImages_shouldShowUp_whenHovered() {
        at(HomePage.class).inHeader()
                .inWomenMenu()
                .goToBlouses();

        at(CategoryPage.class).products()
                .getFirst()
                .view();

        at(ProductPage.class).getThumbnails().forEach(thumbnail -> {
            thumbnail.hover();
            String currentImage = at(ProductPage.class).getCurrentImageSource();
            String thumbnailImage = thumbnail.getSource();

            logger.info("Main image source: " + currentImage + " thumbnail source: " + thumbnailImage);
            assertThat(currentImage).isEqualTo(thumbnailImage);
        });
    }
}
