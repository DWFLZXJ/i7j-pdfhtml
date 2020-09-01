/*
    This file is part of the iText (R) project.
    Copyright (c) 1998-2020 iText Group NV
    Authors: iText Software.

    This program is offered under a commercial and under the AGPL license.
    For commercial licensing, contact us at https://itextpdf.com/sales.  For AGPL licensing, see below.

    AGPL licensing:
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.itextpdf.html2pdf.css.w3c.css_backgrounds;

import com.itextpdf.html2pdf.css.w3c.W3CCssTest;
import com.itextpdf.kernel.PdfException;

import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

// TODO DEVSIX-4383 html files with empty body are not processed. Remove expected exception after fixing
public class BackgroundSizePercentageRootTest extends W3CCssTest {
    @Rule
    public ExpectedException junitExpectedException = ExpectedException.none();

    @Override
    protected String getHtmlFileName() {
        return "background-size-percentage-root.html";
    }

    @Test
    @Override
    public void test() throws IOException, InterruptedException {
        junitExpectedException.expect(PdfException.class);
        junitExpectedException.expectMessage(PdfException.DocumentHasNoPages);
        super.test();
    }
}