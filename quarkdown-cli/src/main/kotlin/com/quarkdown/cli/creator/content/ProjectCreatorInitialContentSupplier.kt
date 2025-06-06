package com.quarkdown.cli.creator.content

import com.quarkdown.cli.creator.template.ProjectCreatorTemplateProcessorFactory
import com.quarkdown.core.pipeline.output.OutputResource

/**
 * Supplier of the initial content of a new Quarkdown project.
 * This includes:
 * - Code content that goes into the main file
 * - Additional resources (e.g. assets)
 * @see ProjectCreator
 */
interface ProjectCreatorInitialContentSupplier {
    /**
     * @return the code content that is inserted into the main file.
     * This code will be processed by the same template processor used by the [ProjectCreator].
     * If `null`, no code content is provided.
     * @see ProjectCreatorTemplateProcessorFactory
     */
    val templateCodeContent: String?

    /**
     * @return a collection of additional resources that are generated by this supplier.
     * This may include assets, additional files, etc.
     */
    fun createResources(): Set<OutputResource>
}
