package tddmicroexercises.textconvertor;

import java.io.IOException;

public class HtmlTextConverter {
    IReader reader;

    public HtmlTextConverter(IReader reader) {
        this.reader = reader;
    }

    public String convertToHtml() throws IOException {

        String line = reader.readLine();
        String html = "";
        while (line != null) {
            html += StringEscapeUtils.escapeHtml(line);
            html += "<br />";
            line = reader.readLine();
        }
        return html;

    }
}
