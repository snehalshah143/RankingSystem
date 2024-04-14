package org.example.core;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import org.example.model.StockRankOutput;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReportGenerator {

    public void generateStockRankReport(String outputFileName, List<StockRankOutput> stockRankOutputList) throws IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException {

        Writer writer = Files.newBufferedWriter(Paths.get(outputFileName));

        ColumnPositionMappingStrategy mappingStrategy = new ColumnPositionMappingStrategy();
        mappingStrategy.setType(StockRankOutput.class);

        StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer)
                .withMappingStrategy(mappingStrategy)
                . withSeparator(',')
                .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                .build();

        beanToCsv.write(stockRankOutputList);
        writer.close();
    }
    public void generateStockRankReport1(String outputFileName, List<StockRankOutput> stockRankOutputList) throws IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException {

        CsvMapper mapper = new CsvMapper();
/*        CsvSchema schema = CsvSchema.builder()
                .addColumn("symbol")
                .addColumn("allPoints")
                .addColumn("allRank")
                .build()
                .withHeader();*/
        CsvSchema schema = mapper.schemaFor(StockRankOutput.class).withHeader();
        mapper.writerFor(StockRankOutput.class).with(schema).writeValues(new File(outputFileName)).writeAll(stockRankOutputList);
    }

}
